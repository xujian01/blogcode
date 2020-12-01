package commandmode.base;

import commandmode.Soldier;

/**
 * @author xujian
 * 2020-12-01 14:48
 *
 * 军官
 *
 * 军官和士兵紧耦合
 **/
public class General {
    /**
     * 士兵
     */
    private Soldier soldier;

    public General(Soldier soldier) {
        this.soldier = soldier;
    }

    /**
     * 下达命令
     * @param order
     */
    public void makeOrder(String order) {
        if ("turnLeft".equals(order)) {
            soldier.turnLeft();
        } else if ("turnRight".equals(order)) {
            soldier.turnRight();
        }
    }

    public static void main(String[] args) {
        General general = new General(new Soldier());
        //下达向左转的命令
        general.makeOrder("turnLeft");
        //下达向右转的命令
        general.makeOrder("turnRight");
    }
}
