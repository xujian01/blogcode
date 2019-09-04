package buildermode;
/**
 * 做汤机器
 *  @author: xujian
 *  @Date: 2019-09-04
 *  @Description:
 */
public class SoupMakeMachine {
    public static Soup builder(SoupProgram program) {
        program.step1();
        program.step2();
        program.step3();
        return program.make();
    }
}
