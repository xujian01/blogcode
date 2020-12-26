package observermode;

public class ObserverB implements Observer {
    @Override
    public void process(String status) {
        System.out.println("B观察者收到了状态变更为【"+status+"】的通知");
    }
}
