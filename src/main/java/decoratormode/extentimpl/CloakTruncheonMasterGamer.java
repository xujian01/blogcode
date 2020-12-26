package decoratormode.extentimpl;
/**
 * 装备了魔法斗篷和法师权杖的法师玩家
 *  @author: xujian
 *  @Date: 2019-09-05
 *  @Description:
 */
public class CloakTruncheonMasterGamer extends TruncheonMasterGamer{
    /**
     * 获取目前的装备
     *
     * @return
     */
    @Override
    public String getEquip() {
        return super.getEquip()+",魔法斗篷";
    }

    /**
     * 获取目前身上装备的价格
     *
     * @return
     */
    @Override
    public int getPrice() {
        return super.getPrice()+80;
    }
}
