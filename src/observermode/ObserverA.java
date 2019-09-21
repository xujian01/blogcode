package observermode;

public class ObserverA implements Observer {
    @Override
    public void process(String status) {
        System.out.println("A观察者收到了状态变更为【"+status+"】的通知");
    }
}
