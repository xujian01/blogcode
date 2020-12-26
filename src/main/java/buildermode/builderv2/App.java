package buildermode.builderv2;

public class App {
    public static void main(String[] args) {
        System.out.println("-----制作小鸡炖蘑菇-----");
        Soup soup = Soup.newBuilder().cailiao1("小鸡儿")
                .cailiao2("蘑菇")
                .cailiao3("小鸡炖蘑菇精粉")
                .build();
        System.out.println("小鸡炖蘑菇："+soup);
        System.out.println("-----制作海带排骨汤-----");
        Soup soup1 = Soup.newBuilder().cailiao1("海带")
                .cailiao2("排骨")
                .cailiao3("海带排骨精粉")
                .build();
        System.out.println("海带排骨汤："+soup1);
    }
}
