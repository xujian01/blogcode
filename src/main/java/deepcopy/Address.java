package deepcopy;

import java.io.Serializable;

/**
 * @author xujian
 * @date 2020-12-20 14:52
 **/
public class Address implements Cloneable, Serializable {
    private String addr;
    private City city;

    public Address() {

    }

    public Address(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address = (Address) super.clone();
        City city = (City) address.getCity().clone();
        address.setCity(city);
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                ", city=" + city +
                '}';
    }
}
