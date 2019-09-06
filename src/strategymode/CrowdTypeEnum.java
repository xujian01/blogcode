package strategymode;
/**
 * 人群类别枚举
 *  @author: xujian
 *  @Date: 2019-09-06
 *  @Description:
 */
public enum CrowdTypeEnum {
    COLLEGESTUDENT("COLLEGESTUDENT","大学生"),
    PIONEER("PIONEER","创业者"),
    OTHER("OTHER","其他");

    private String code;
    private String name;
    CrowdTypeEnum(String code,String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
