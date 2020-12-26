package strategymode;
/**
 * 具体的策略：创业者落户策略
 *  @author: xujian
 *  @Date: 2019-09-06
 *  @Description:
 */
public class PioneerStrategy implements Strategy {
    /**
     * 策略处理方法
     *
     */
    @Override
    public void handle() {
        System.out.println("凡在我市依法注册登记并正常经营的市场主体，其法定代表人、员工和个体经营者可迁入本市落户。");
    }
}
