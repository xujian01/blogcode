package chainmode;

public class App {
    public static void main(String[] args) {
        MaterialProcessor cottonProcessor = new CottonMaterialProcessor();
        MaterialProcessor milkProcessor = new MilkMaterialProcessor();
        MaterialProcessor woodProcessor = new WoodMaterialProcessor();
        cottonProcessor.setProcessor(milkProcessor).setProcessor(woodProcessor);
        cottonProcessor.process(new Cotton());
        System.out.println("---------------------------");
        cottonProcessor.process(new Wood());
        System.out.println("---------------------------");
        cottonProcessor.process(new Glass());
    }
}
