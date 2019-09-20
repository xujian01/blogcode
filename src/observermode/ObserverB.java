package observermode;

public class ObserverB implements Observer {
    @Override
    public void process() {
        System.out.println("B观察者收到了通知，开始进行处理...");
    }
}
