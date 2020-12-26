package templatemode;

public class RedisDataSourceTemplate extends AbstractDataSourceTemplate {
    /**
     * 开启连接
     */
    @Override
    void open() {
        System.out.println("开启redis连接...");
    }

    /**
     * 执行操作
     */
    @Override
    void execute() {
        System.out.println("操作redis...");
    }

    /**
     * 关闭连接
     */
    @Override
    void close() {
        System.out.println("关闭redis连接...");
    }
}
