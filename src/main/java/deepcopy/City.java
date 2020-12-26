package deepcopy;

import java.io.Serializable;

/**
 * @author xujian
 * @date 2020-12-26 12:30
 **/
public class City implements Cloneable, Serializable {
    private String name;

    public City() {

    }

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
