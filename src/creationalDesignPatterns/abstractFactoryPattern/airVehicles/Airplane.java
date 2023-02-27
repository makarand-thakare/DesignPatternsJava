package creationalDesignPatterns.abstractFactoryPattern.airVehicles;

public class Airplane implements AirVehicle {
    @Override
    public void fly() {
        System.out.println("I am flying an airplane");
    }
}
