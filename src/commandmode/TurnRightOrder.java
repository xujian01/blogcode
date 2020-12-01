package commandmode;

/**
 * @author xujian
 * 2020-11-30 17:08
 *
 * 向右转命令
 **/
public class TurnRightOrder implements Order{
    /**
     * 士兵
     */
    private Soldier soldier;

    public TurnRightOrder(Soldier soldier) {
        this.soldier = soldier;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        soldier.turnRight();
    }
}
