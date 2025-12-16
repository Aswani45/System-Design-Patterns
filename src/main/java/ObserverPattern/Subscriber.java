package ObserverPattern;

public class Subscriber implements Observer{
    String name;
    Subscriber(String name){
        this.name = name;
    }
    @Override
    public void notified(String title) {
        System.out.println("HEY "+name+", new Video is uploaded with title "+title);
    }
}
