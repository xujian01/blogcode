package buildermode;

public class App {
  public static void main(String[] args) {
    //人工做汤
    System.out.println("-----人工做汤-----");
    //制作小鸡炖蘑菇汤
    System.out.println("-----制作小鸡炖蘑菇-----");
    Soup xiaojimoguSoup = new Soup();
    xiaojimoguSoup.setCailiao1("小鸡儿");
    xiaojimoguSoup.setCailiao2("蘑菇");
    xiaojimoguSoup.setCailiao3("小鸡炖蘑菇精粉");
    System.out.println("小鸡炖蘑菇："+xiaojimoguSoup);
    //制作海带排骨汤
    System.out.println("-----制作海带排骨汤-----");
    Soup haidaipaiguSoup = new Soup();
    haidaipaiguSoup.setCailiao1("海带");
    haidaipaiguSoup.setCailiao2("排骨");
    haidaipaiguSoup.setCailiao3("海带排骨精粉");
    System.out.println("海带排骨汤："+haidaipaiguSoup);
    //机器做汤
    System.out.println("-----机器做汤-----");
    //制作小鸡炖蘑菇汤
    System.out.println("-----制作小鸡炖蘑菇-----");
    SoupProgram program = new XiaojimoguSoupProgram();
    System.out.println("小鸡炖蘑菇："+SoupMakeMachine.builder(program));
    //制作海带排骨汤
    System.out.println("-----制作海带排骨汤-----");
    SoupProgram program1 = new HaidaipaiguSoupProgram();
    System.out.println("海带排骨汤："+SoupMakeMachine.builder(program1));
  }
}
