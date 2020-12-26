package decoratormode;
/**
 * 魔法斗篷（具体装饰器）
 *  @author: xujian
 *  @Date: 2019-09-05
 *  @Description:
 */
public class Cloak extends Equip {
    public Cloak(Gamer gamer) {
        super(gamer);
    }

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
