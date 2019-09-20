package observermode;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observerList) {
            observer.process();
        }
    }

    @Override
    public void notifyOneObserver(int index) {
        Observer observer = observerList.get(index);
        observer.process();
    }
}
