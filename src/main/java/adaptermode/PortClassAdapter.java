package adaptermode;
/**
 * 接口转换器（类适配器）
 *  @author: xujian
 *  @Date: 2019-09-09
 *  @Description:
 */
public class PortClassAdapter extends Lightning implements TypeC {
    @Override
    public void useTypeCPort() {
        System.out.println("使用type-c转接头");
        super.extent();
    }
}
