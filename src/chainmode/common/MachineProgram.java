package chainmode.common;

import chainmode.Cotton;
import chainmode.Material;
import chainmode.Milk;
import chainmode.Wood;

/**
 * 机器程序
 *  @author: xujian
 *  @Date: 2019-09-23
 *  @Description:
 */
public class MachineProgram {
    public static void produce(Material material) {
        if (material instanceof Cotton) {
            System.out.println("原材料：棉花，生产出棉布");
        } else if (material instanceof Milk) {
            System.out.println("原材料：牛奶，生产出奶酪");
        } else if (material instanceof Wood) {
            System.out.println("原材料：木头，生产出椅子");
        }
    }
}
