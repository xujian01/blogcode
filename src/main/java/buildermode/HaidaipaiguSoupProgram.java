package buildermode;
/**
 * 海带排骨汤
 *  @author: xujian
 *  @Date: 2019-09-04
 *  @Description:
 */
public class HaidaipaiguSoupProgram implements SoupProgram {
    private Soup soup = new Soup();
    @Override
    public void step1() {
        soup.setCailiao1("海带");
    System.out.println("加入海带");
    }

    @Override
    public void step2() {
        soup.setCailiao2("排骨");
    System.out.println("加入排骨");
    }

    @Override
    public void step3() {
        soup.setCailiao3("海带排骨精粉");
    System.out.println("加入海带排骨精粉");
    }

    @Override
    public Soup make() {
    System.out.println("海带排骨汤制作好啦～");
    return soup;
    }
}
