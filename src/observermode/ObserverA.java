package observermode;

public class ObserverA implements Observer {
    @Override
    public void process() {
        System.out.println("A观察者收到了通知，开始进行处理...");
    }
}
