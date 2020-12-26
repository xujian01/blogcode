package observermode;

public class App {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();

        //注册观察者A
        Observer observerA = new ObserverA();
        subject.registerObserver(observerA);

        //注册观察者B
        Observer observerB = new ObserverB();
        subject.registerObserver(observerB);

        subject.setStatus("进行中");
        System.out.println("被观察者状态变为【进行中】，正在通知观察者们...");
        //通知所有观察者
        subject.notifyAllObserver();
    }
}
