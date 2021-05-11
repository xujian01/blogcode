package mybatisplugin.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author xujian
 * 2021-05-11 16:11
 **/
@Data
public class NameInfo {
    private int id;
    private String name;
    private Date createTime;
}
