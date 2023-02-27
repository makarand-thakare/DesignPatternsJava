package creationalDesignPatterns.factoryPattern;

import creationalDesignPatterns.factoryPattern.vehicleFactory.Vehicle;
import creationalDesignPatterns.factoryPattern.vehicleFactory.VehicleFactory;

public class MainFactoryPattern {
    public static void main(String[] args) {
        VehicleFactory factory= new VehicleFactory();
        Vehicle vehicle = factory.getVehicle("car");
        vehicle.drive();

        vehicle = factory.getVehicle("bike");
        vehicle.drive();
    }
}
