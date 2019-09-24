package chainmode;

public class MilkMaterialProcessor extends MaterialProcessor {

    @Override
    void doProcess(Material material) {
        System.out.println("原材料：牛奶，生产出奶酪");
    }

    @Override
    public boolean canProcess(Material material) {
        return material instanceof Milk;
    }

    @Override
    String getProcessName() {
        return "牛奶处理器";
    }
}
