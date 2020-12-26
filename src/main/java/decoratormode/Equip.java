package decoratormode;
/**
 * 装备（装饰器）
 *  @author: xujian
 *  @Date: 2019-09-05
 *  @Description:
 */
public abstract class Equip implements Gamer {
    private Gamer gamer;

    public Equip(Gamer gamer) {
        this.gamer = gamer;
    }
    /**
     * 获取目前的装备
     *
     * @return
     */
    @Override
    public String getEquip() {
        return gamer.getEquip();
    }

    /**
     * 获取目前身上装备的价格
     *
     * @return
     */
    @Override
    public int getPrice() {
        return gamer.getPrice();
    }
}
