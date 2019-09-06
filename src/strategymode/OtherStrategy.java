package strategymode;
/**
 * 具体的策略：其他落户策略
 *  @author: xujian
 *  @Date: 2019-09-06
 *  @Description:
 */
public class OtherStrategy implements Strategy {
    /**
     * 策略处理类
     *
     */
    @Override
    public void handle() {
        System.out.println("详讯本地公安局。");
    }
}
