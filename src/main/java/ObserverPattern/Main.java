package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Observer subscriber1 = new Subscriber("Aman");
        Observer subscriber2 = new Subscriber("Raman");
        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.notifyObservers("Learn code");
        channel.unSubscribe(subscriber1);
        channel.notifyObservers("Learn Java");
    }
}
