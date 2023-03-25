package behavioralDesignPatterns.observerDesignPattern;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void receiveUpdate(String videoTitle) {
        System.out.println(name + ": Received notification for: " + videoTitle);
    }
}
