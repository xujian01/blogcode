package adaptermode;
/**
 * 接口转换器（对象适配器）
 *  @author: xujian
 *  @Date: 2019-09-09
 *  @Description:
 */
public class PortObjectAdapter implements TypeC {
    private Lightning lightning;

    public PortObjectAdapter(Lightning lightning) {
        this.lightning = lightning;
    }

    @Override
    public void useTypeCPort() {
        System.out.println("使用type-c转接头");
        lightning.extent();
    }
}
