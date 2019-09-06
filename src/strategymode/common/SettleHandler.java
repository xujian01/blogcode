package strategymode.common;

import strategymode.CrowdTypeEnum;

/**
 * 落户处理类
 *  @author: xujian
 *  @Date: 2019-09-06
 *  @Description:
 */
public class SettleHandler {
    /**
     * 处理户口
     * @param crowdType 人群类型：大学生，创业者，其他
     */
    public static void handleSettle(String crowdType) {
        if (CrowdTypeEnum.COLLEGESTUDENT.getCode().equals(crowdType)) {
            //一系列处理操作
            System.out.println("全国高等院校在校学生(教育部学信网在册人员)，均可迁入本市落户。");
        } else if (CrowdTypeEnum.PIONEER.getCode().equals(crowdType)) {
            //一系列处理操作
            System.out.println("凡在我市依法注册登记并正常经营的市场主体，其法定代表人、员工和个体经营者可迁入本市落户。");
        } else if (CrowdTypeEnum.OTHER.getCode().equals(crowdType)) {
            //一系列处理操作
            System.out.println("详讯本地公安局。");
        }
    }
}
