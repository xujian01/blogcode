package mybatisplugin;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.resultset.ResultSetHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import java.sql.Statement;

/**
 * @author xujian
 * 2021-05-11 15:22
 **/
@Intercepts(@Signature(type = ResultSetHandler.class,//指定你要拦截是哪个对象
        method = "handleResultSets",//指定你要拦截的是哪个方法
        args = {Statement.class}))//考虑到方法重载，还需要指定参数列表
@Slf4j
public class MyPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        log.info("----插件拦截到handleResultSets----");
        //实行原始的方法调用
        return invocation.proceed();
    }
}
