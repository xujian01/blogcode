package deepcopy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xujian
 * @date 2020-12-20 15:08
 **/
public class Demo {
    public static void main(String[] args) throws Exception {
        User source = new User();
        source.setAge(70);
        Address address = new Address();
        address.setAddr("陕西省");
        City city = new City("渭南市");
        address.setCity(city);
        source.setAddr(address);

//        String userJsonStr = JSON.toJSONString(source);
//        User copyUser = JSON.parseObject(userJsonStr,User.class);
//        User copyUser = getDeepCopyInstance(source);
//        User copyUser = (User) source.clone();
        User copyUser = jdkDeepCopy(source);

        System.out.println(source);
        System.out.println(copyUser);
        System.out.println(source == copyUser);
    }

    /**
     * 得到指定对象的一个深拷贝对象
     * @return
     */
    public static User getDeepCopyInstance(User source) {
        User copyUser = new User();
        copyUser.setAge(source.getAge());
        Address address = new Address();
        address.setAddr(source.getAddr().getAddr());
        City city = new City();
        city.setName(source.getAddr().getCity().getName());
        address.setCity(city);
        copyUser.setAddr(address);
        return copyUser;
    }

    /**
     * jdk序列化/反序列化
     * @param source
     * @return
     * @throws Exception
     */
    public static User jdkDeepCopy(User source) throws Exception {
        //将对象写到流里
        ByteArrayOutputStream bo=new ByteArrayOutputStream();
        ObjectOutputStream oo=new ObjectOutputStream(bo);
        oo.writeObject(source);
        //从流里读出来
        ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi=new ObjectInputStream(bi);
        return (User) oi.readObject();
    }
}
