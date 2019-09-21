package observermode;

public class SubjectImpl implements Subject {

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
