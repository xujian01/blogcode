package decoratormode.extentimpl;

public class App {
    public static void main(String[] args) {
        CloakTruncheonMasterGamer gamer = new CloakTruncheonMasterGamer();
        System.out.println("当前装备："+gamer.getEquip()+"\n装备总价值："+gamer.getPrice());
    }
}
