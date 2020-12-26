package strategymode.common;

import strategymode.CrowdTypeEnum;

public class App {
    public static void main(String[] args) {
        //大学生
        String myCrowdType = CrowdTypeEnum.COLLEGESTUDENT.getCode();
        System.out.print("大学生落户政策：");
        SettleHandler.handleSettle(myCrowdType);
        //创业者
        String myCrowdType1 = CrowdTypeEnum.PIONEER.getCode();
        System.out.print("创业者落户政策：");
        SettleHandler.handleSettle(myCrowdType1);
    }
}
