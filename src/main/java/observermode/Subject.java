package observermode;

/**
 *  被观察者
 *  @author: xujian
 *  @Date: 2019-09-20
 *  @Description:
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    void notifyAllObserver();
}
