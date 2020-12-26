package observermode;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private String status;

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
            observer.process(status);
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
