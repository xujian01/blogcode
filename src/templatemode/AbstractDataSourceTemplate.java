package templatemode;
/**
 * 数据源操作模版
 *  @author: xujian
 *  @Date: 2019-09-26
 *  @Description:
 */
public abstract class AbstractDataSourceTemplate {
    /**
     * 开启连接
     */
    abstract void open();

    /**
     * 执行操作
     */
    abstract void execute();

    /**
     * 关闭连接
     */
    abstract void close();

    /**
     * 模版方法
     */
    public final void run() {
        open();
        execute();
        close();
    }
}
