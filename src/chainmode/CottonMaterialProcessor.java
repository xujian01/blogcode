package chainmode;

public class CottonMaterialProcessor extends MaterialProcessor {

    @Override
    void doProcess(Material material) {
        System.out.println("原材料：棉花，生产出棉布");
    }

    @Override
    public boolean canProcess(Material material) {
        return material instanceof Cotton;
    }

    @Override
    String getProcessName() {
        return "棉花处理器";
    }
}
