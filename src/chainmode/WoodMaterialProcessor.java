package chainmode;

public class WoodMaterialProcessor extends MaterialProcessor {

    @Override
    void doProcess(Material material) {
        System.out.println("原材料：木头，生产出椅子");
    }

    @Override
    public boolean canProcess(Material material) {
        return material instanceof Wood;
    }

    @Override
    String getProcessName() {
        return "木头处理器";
    }
}
