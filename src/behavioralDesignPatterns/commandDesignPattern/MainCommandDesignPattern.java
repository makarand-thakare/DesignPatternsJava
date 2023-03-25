package behavioralDesignPatterns.commandDesignPattern;

public class MainCommandDesignPattern {
    public static void main(String[] args) {

        Broker broker = new Broker();
        broker.addOrder(new BuyStock(new AndroidStock()));
        broker.addOrder(new BuyStock(new AndroidStock()));
        broker.addOrder(new SellStock(new AndroidStock()));
        broker.placeOrders();
    }
}
