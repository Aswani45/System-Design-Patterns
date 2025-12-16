package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyObservers(String title) {
        for(Observer subscriber : subscribers){
            subscriber.notified(title);
        }
    }
}
