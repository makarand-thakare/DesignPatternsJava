package behavioralDesignPatterns.commandDesignPattern;

import java.util.ArrayList;

public class Broker {
    ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
