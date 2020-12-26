package templatemode;

public class JdbcDataSourceTemplate extends AbstractDataSourceTemplate {
    /**
     * 开启连接
     */
    @Override
    void open() {
        System.out.println("开启jdbc连接...");
    }

    /**
     * 执行操作
     */
    @Override
    void execute() {
        System.out.println("操作jdbc...");
    }

    /**
     * 关闭连接
     */
    @Override
    void close() {
        System.out.println("关闭jdbc连接...");
    }
}
