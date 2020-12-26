package buildermode;
/**
 * 汤
 *  @author: xujian
 *  @Date: 2019-09-04
 *  @Description:
 */
public class Soup {
    /**
     * 材料1
     */
    private String cailiao1;
    /**
     * 材料2
     */
    private String cailiao2;
    /**
     * 材料3
     */
    private String cailiao3;

    public String getCailiao1() {
        return cailiao1;
    }

    public void setCailiao1(String cailiao1) {
        this.cailiao1 = cailiao1;
    }

    public String getCailiao2() {
        return cailiao2;
    }

    public void setCailiao2(String cailiao2) {
        this.cailiao2 = cailiao2;
    }

    public String getCailiao3() {
        return cailiao3;
    }

    public void setCailiao3(String cailiao3) {
        this.cailiao3 = cailiao3;
    }

    @Override
    public String toString() {
        return "Soup{" +
                "cailiao1='" + cailiao1 + '\'' +
                ", cailiao2='" + cailiao2 + '\'' +
                ", cailiao3='" + cailiao3 + '\'' +
                '}';
    }
}
