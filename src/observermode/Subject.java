package observermode;

import java.util.ArrayList;
import java.util.List;

/**
 *  被观察者
 *  @author: xujian
 *  @Date: 2019-09-20
 *  @Description:
 */
public interface Subject {
    List<Observer> observerList = new ArrayList<>();
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
    void notifyOneObserver(int index);
}
