package buildermode;

public class App {
  public static void main(String[] args) {
      //制作小鸡炖蘑菇汤
    SoupProgram program = new XiaojimoguSoupProgram();
    SoupMakeMachine.builder(program);
    // 制作海带排骨汤
    System.out.println("--------------------");
    SoupProgram program1 = new HaidaipaiguSoupProgram();
    SoupMakeMachine.builder(program1);
  }
}
