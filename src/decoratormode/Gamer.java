package decoratormode;
/**
 * 游戏玩家
 *  @author: xujian
 *  @Date: 2019-09-05
 *  @Description:
 */
public interface Gamer {
    /**
     * 获取目前的装备
     * @return
     */
    String getEquip();

    /**
     * 获取目前身上装备的价格
     * @return
     */
    int getPrice();
}
