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
@Intercepts(@Signature(type = ResultSetHandler.class,
        method = "handleResultSets",
        args = {Statement.class}))
@Slf4j
public class MyPlugin implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        log.info("----插件拦截到handleResultSets----");
        return invocation.proceed();
    }
}
