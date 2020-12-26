package shallowcopy;

/**
 * @author xujian
 * @date 2020-12-20 14:52
 **/
public class User implements Cloneable {
    private int age;
    private Address addr;

    public User(int age, Address addr) {
        this.age = age;
        this.addr = addr;
    }

    public User(User source) {
        this.age = source.age;
        this.addr = source.addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", addr=" + addr +
                '}';
    }
}
