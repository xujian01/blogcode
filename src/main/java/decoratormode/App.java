package decoratormode;

public class App {
    public static void main(String[] args) {
        //创建一个法师玩家
        Gamer gamer = new MasterGamer();
        //给法师玩家装备法师权杖
        gamer = new Truncheon(gamer);
        //给法师玩家装备魔法斗篷
        gamer = new Cloak(gamer);
        System.out.println("当前装备："+gamer.getEquip()+"\n装备总价值："+gamer.getPrice());
    }
}
