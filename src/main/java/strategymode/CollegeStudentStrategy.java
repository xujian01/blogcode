package strategymode;
/**
 * 具体的策略：大学生落户策略
 *  @author: xujian
 *  @Date: 2019-09-06
 *  @Description:
 */
public class CollegeStudentStrategy implements Strategy {
    /**
     * 策略处理类
     *
     */
    @Override
    public void handle() {
        System.out.println("全国高等院校在校学生(教育部学信网在册人员)，均可迁入本市落户。");
    }
}
