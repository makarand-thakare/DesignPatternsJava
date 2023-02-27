package creationalDesignPatterns.abstractFactoryPattern.groundVehicles;

public class Car implements GroundVehicle {
    @Override
    public void drive() {
        System.out.println("I am driving a car");
    }
}
