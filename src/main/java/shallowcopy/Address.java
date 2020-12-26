package shallowcopy;

/**
 * @author xujian
 * @date 2020-12-20 14:52
 **/
public class Address {
    private String addr;

    public Address(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                '}';
    }
}
