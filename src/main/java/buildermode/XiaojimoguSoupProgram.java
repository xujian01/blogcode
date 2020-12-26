package buildermode;
/**
 * 小鸡炖蘑菇汤
 *  @author: xujian
 *  @Date: 2019-09-04
 *  @Description:
 */
public class XiaojimoguSoupProgram implements SoupProgram {
    private Soup soup = new Soup();
    @Override
    public void step1() {
        soup.setCailiao1("小鸡儿");
    System.out.println("加入小鸡儿");
    }

    @Override
    public void step2() {
        soup.setCailiao2("蘑菇");
    System.out.println("加入蘑菇");
    }

    @Override
    public void step3() {
        soup.setCailiao3("小鸡炖蘑菇精粉");
    System.out.println("加入小鸡炖蘑菇精粉");
    }

    @Override
    public Soup make() {
    System.out.println("小鸡炖蘑菇汤制作好啦～");
    return soup;
    }
}
