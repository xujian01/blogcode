package commandmode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xujian
 * 2020-11-30 17:18
 *
 * 军官
 **/
public class General {
    /**
     * 命令清单
     */
    private List<Order> orderList = new ArrayList<>();

    /**
     * 添加命令到命令清单
     * @param order
     */
    public void addOrder(Order order) {
        orderList.add(order);
    }

    /**
     * 下达命令清单上的所有命令
     */
    public void issueOrderList() {
        for (Order order : orderList) {
            issueOrder(order);
        }
    }

    /**
     * 下达命令
     * @param order
     */
    public void issueOrder(Order order) {
        order.execute();
    }
}
