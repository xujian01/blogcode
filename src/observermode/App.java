package observermode;

public class App {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        Observer observerA = new ObserverA();
        subject.registerObserver(observerA);

        Observer observerB = new ObserverB();
        subject.registerObserver(observerB);

        subject.notifyAllObserver();

        subject.notifyOneObserver(1);
    }
}
