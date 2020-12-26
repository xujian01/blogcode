package decoratormode.extentimpl;

import decoratormode.Gamer;

/**
 * 法师玩家
 *  @author: xujian
 *  @Date: 2019-09-05
 *  @Description:
 */
public class MasterGamer implements Gamer {
    /**
     * 获取目前的装备
     *
     * @return
     */
    @Override
    public String getEquip() {
        return "大裤衩";
    }

    /**
     * 获取目前身上装备的价格
     *
     * @return
     */
    @Override
    public int getPrice() {
        return 5;
    }
}
