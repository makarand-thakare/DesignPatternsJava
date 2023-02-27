package creationalDesignPatterns.abstractFactoryPattern.airVehicles;

public class Helicopter implements AirVehicle {
    @Override
    public void fly() {
        System.out.println("I am flying a helicopter");
    }
}
