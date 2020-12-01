package commandmode;

/**
 * @author xujian
 * 2020-11-30 17:12
 *
 * 向左转命令
 **/
public class TurnLeftOrder implements Order {
    /**
     * 士兵
     */
    private Soldier soldier;

    public TurnLeftOrder(Soldier soldier) {
        this.soldier = soldier;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        soldier.turnLeft();
    }
}
