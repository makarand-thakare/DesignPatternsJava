package creationalDesignPatterns.abstractFactoryPattern.groundVehicles;

public class Bike implements GroundVehicle {
    @Override
    public void drive() {
        System.out.println("I am driving a bike");
    }
}
