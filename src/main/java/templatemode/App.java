package templatemode;

public class App {
    public static void main(String[] args) {
        //jdbc模版
        AbstractDataSourceTemplate template = new JdbcDataSourceTemplate();
        template.run();
        System.out.println("----------------");
        //redis模版
        AbstractDataSourceTemplate template1 = new RedisDataSourceTemplate();
        template1.run();
    }
}
