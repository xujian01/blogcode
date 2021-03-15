package javaagent.agent;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * @author xujian
 * 2021-03-12 10:58
 **/
public class MyBizAgentMain {
    public static void agentmain(String agentArgs, Instrumentation inst) throws UnmodifiableClassException {
        System.out.println("---agent called---");
        inst.addTransformer(new MyClassFileTransformer(),true);//添加类文件转换器，第二个参数必须设置为true，表示可以重新转换类文件
        Class[] classes = inst.getAllLoadedClasses();
        for (int i = 0; i < classes.length; i++) {
            if ("agent.MyBizMain".equals(classes[i].getName())) {
                System.out.println("----重新加载MyBizMain开始----");
                inst.retransformClasses(classes[i]);
                System.out.println("----重新加载MyBizMain完毕----");
                break;
            }
        }
    }
}
