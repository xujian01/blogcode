package buildermode.builderv2;
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
    private Soup(Builder builder) {
        this.cailiao1 = builder.cailiao1;
        this.cailiao2 = builder.cailiao2;
        this.cailiao3 = builder.cailiao3;
    }
    public static Soup.Builder newBuilder() {
        return new Soup.Builder();
    }
    public static class Builder {
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
        public Builder cailiao1(String s) {
            System.out.println("加入"+s);
            this.cailiao1 = s;
            return this;
        }
        public Builder cailiao2(String s) {
            System.out.println("加入"+s);
            this.cailiao2 = s;
            return this;
        }
        public Builder cailiao3(String s) {
            System.out.println("加入"+s);
            this.cailiao3 = s;
            return this;
        }
        public Soup build() {
            return new Soup(this);
        }
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
