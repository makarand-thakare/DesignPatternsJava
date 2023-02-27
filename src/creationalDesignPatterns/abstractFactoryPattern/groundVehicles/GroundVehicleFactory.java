package creationalDesignPatterns.abstractFactoryPattern.groundVehicles;

import creationalDesignPatterns.abstractFactoryPattern.factoryProvider.AbstractFactory;
import creationalDesignPatterns.abstractFactoryPattern.airVehicles.AirVehicle;

public class GroundVehicleFactory extends AbstractFactory {

    @Override
    public GroundVehicle getGroundVehicle(String vehicle) {
        GroundVehicle groundVehicle = null;
        switch (vehicle) {
            case "bike":
                groundVehicle = new Bike();
                break;

            case "car":
                groundVehicle = new Car();
                break;
        }
        return groundVehicle;
    }

    @Override
    public AirVehicle getAircraftVehicle(String vehicle) {
        return null;
    }
}
