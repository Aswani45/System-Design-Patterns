package ObserverPattern;

public interface Subject {
    public void subscribe(Observer subscriber);

    public void unSubscribe(Observer subscriber);


    public void notifyObservers(String title);
}
