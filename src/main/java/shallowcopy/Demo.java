package shallowcopy;

/**
 * @author xujian
 * @date 2020-12-20 15:08
 **/
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("北京市");
        User userA = new User(10,addr);
        User userCopy = (User) userA.clone();
        System.out.println(userA);
        System.out.println(userCopy);
        System.out.println(userA == userCopy);
        userCopy.setAge(20);
        addr.setAddr("西安市");
        System.out.println(userA);
        System.out.println(userCopy);
        System.out.println(userA.getAddr() == userCopy.getAddr());
    }
}
