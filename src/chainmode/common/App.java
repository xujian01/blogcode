package chainmode.common;

import chainmode.Cotton;
import chainmode.Material;
import chainmode.Milk;
import chainmode.Wood;

public class App {
    public static void main(String[] args) {
        //生产棉布
        Material material = new Cotton();
        MachineProgram.produce(material);

        //生产牛奶
        Material material1 = new Milk();
        MachineProgram.produce(material1);

        //生产椅子
        Material material2 = new Wood();
        MachineProgram.produce(material2);
    }
}
