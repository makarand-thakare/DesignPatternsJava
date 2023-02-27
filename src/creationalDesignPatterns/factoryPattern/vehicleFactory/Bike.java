package creationalDesignPatterns.factoryPattern.vehicleFactory;

public class Bike implements Vehicle{

    @Override
    public void drive() {
        System.out.println("I am driving a bike");
    }
}
