package com.xxx.sys;

import com.alibaba.fastjson.JSON;
import javassist.*;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.MethodInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * 访问日志织入，自动添加方法首尾日志
 *
 * @author xujian
 * @create 2019-01-11 10:05
 **/
@Aspect
@Component
public class AccessLogAop {
    @Pointcut(value = "@annotation(com.sunlands.sys.AccessLog)")
    public void pointcut() {
    }

    @Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Class targetClass = pjp.getTarget().getClass();
        String methodName = pjp.getSignature().getName();
        Class<?>[] parameterTypes = ((MethodSignature) pjp.getSignature()).getMethod().getParameterTypes();
        Method targetMethod = targetClass.getDeclaredMethod(methodName,parameterTypes);
        AccessLog accessLog = targetMethod.getAnnotation(AccessLog.class);
        String[] paramsName = accessLog.paramsName();
        Field field = targetClass.getDeclaredField("logger");
        field.setAccessible(true);
        Logger logger = (Logger) field.get(targetClass);
        String targetMethodName = pjp.getSignature().getName();
        StringBuilder sb = new StringBuilder();
//        List<String> paramNames = getParamNames(this.getClass(), targetClass.getName(),targetMethodName);
        Object[] args = pjp.getArgs();
        for (int i=0;i<args.length;i++) {
            Object o = args[i];
            if (o == null) {
                o = "null";
            }
            Object paramValue = o;
            //判断是否是基本类型，非基本类型的话转为json字符串
            if (!o.getClass().isPrimitive() && !"java.lang.String".equals(o.getClass().getName())) {
                paramValue = JSON.toJSONString(o);
            }
            sb.append(o.getClass().getSimpleName()+" "+paramsName[i]+" = "+paramValue);
            sb.append(",");
        }
        String beginLog = "----------"+targetMethodName+"("+sb.substring(0,sb.length()-1)+")----------START";
        logger.info(beginLog);
        Object result = pjp.proceed();
        String endLog = "----------"+targetMethodName+"("+sb.substring(0,sb.length()-1)+")----------END";
        logger.info(endLog);
        return result;
    }

    /**
     * 字节码技术来获取方法形参列表，结果不太完美（已废弃）
     * @param cls
     * @param clazzName
     * @param methodName
     * @return
     * @throws NotFoundException
     */
    @Deprecated
    private List<String> getParamNames(Class cls, String clazzName, String methodName) throws NotFoundException {
        List<String> result=new ArrayList<>();
        ClassPool pool = ClassPool.getDefault();
        ClassClassPath classPath = new ClassClassPath(cls);
        pool.insertClassPath(classPath);
        CtClass cc = pool.get(clazzName);
        CtMethod cm = cc.getDeclaredMethod(methodName);
        MethodInfo methodInfo = cm.getMethodInfo();
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        LocalVariableAttribute attr = (LocalVariableAttribute) codeAttribute.getAttribute(LocalVariableAttribute.tag);
        if (attr == null) {
            // exception
        }
        int pos = Modifier.isStatic(cm.getModifiers()) ? 0 : 1;
        CtClass[] paramsType = cm.getParameterTypes();
        for (int i = 0; i < paramsType.length; i++){
            result.add(attr.variableName(i + pos));
        }
        return result;
    }

}
