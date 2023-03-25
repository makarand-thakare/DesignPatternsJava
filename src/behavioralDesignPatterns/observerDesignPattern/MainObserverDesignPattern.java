package behavioralDesignPatterns.observerDesignPattern;

public class MainObserverDesignPattern {
    public static void main(String[] args) {

        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");
        Subscriber subscriber3 = new Subscriber("Subscriber 3");

        Publisher publisher = new Publisher();
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        publisher.publishNewVideo("How to write hello world in Java language");
    }
}
