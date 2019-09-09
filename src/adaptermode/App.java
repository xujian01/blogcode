package adaptermode;

public class App {
    public static void main(String[] args) {
        //对象适配器
        System.out.println("----对象适配器----");
        Lightning lightning = new Lightning();
        PortObjectAdapter adapter = new PortObjectAdapter(lightning);
        adapter.useTypeCPort();
        //类适配器
        System.out.println("----类适配器----");
        PortClassAdapter adapter1 = new PortClassAdapter();
        adapter1.useTypeCPort();
    }
}
