package strategymode;

public class App {
    public static void main(String[] args) {
        //大学生落户
        Strategy strategy = new CollegeStudentStrategy();
        StrategyContext context = new StrategyContext(strategy);
        System.out.print("大学生落户政策：");
        context.handle();
        //创业者落户
        Strategy strategy1 = new PioneerStrategy();
        StrategyContext context1 = new StrategyContext(strategy1);
        System.out.print("大学生落户政策：");
        context1.handle();
        //其他落户
        Strategy strategy2 = new OtherStrategy();
        StrategyContext context2 = new StrategyContext(strategy2);
        System.out.print("其他落户政策：");
        context2.handle();
    }
}
