package commandmode;

/**
 * @author xujian
 * 2020-11-30 17:26
 **/
public class TestCommandMode {
    public static void main(String[] args) {
        General general = new General();
        Soldier soldier = new Soldier();
        Order orderLeft = new TurnLeftOrder(soldier);
        Order orderRight = new TurnRightOrder(soldier);
        general.addOrder(orderLeft);
        general.addOrder(orderRight);
        //执行命令清单上的命令
        System.out.println("----执行命令清单上的命令----");
        general.issueOrderList();
        //执行指定命令
        System.out.println("----执行指定命令----");
        general.issueOrder(orderLeft);
    }
}
