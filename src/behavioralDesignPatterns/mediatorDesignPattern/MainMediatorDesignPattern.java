package behavioralDesignPatterns.mediatorDesignPattern;

public class MainMediatorDesignPattern {
    public static void main(String[] args) {
        User user1 = new User("Person 1");
        User user2 = new User("Person 2");

        user1.sendMessage("Hi there!");
        user2.sendMessage("Hello!");
    }
}
