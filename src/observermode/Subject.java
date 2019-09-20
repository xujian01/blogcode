package observermode;
/**
 *  被观察者
 *  @author: xujian
 *  @Date: 2019-09-20
 *  @Description:
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver();
    void notifyOneObserver(int index);
}
