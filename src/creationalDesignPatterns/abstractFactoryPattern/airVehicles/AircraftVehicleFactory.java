package creationalDesignPatterns.abstractFactoryPattern.airVehicles;

import creationalDesignPatterns.abstractFactoryPattern.factoryProvider.AbstractFactory;
import creationalDesignPatterns.abstractFactoryPattern.groundVehicles.GroundVehicle;

public class AircraftVehicleFactory extends AbstractFactory {

    @Override
    public GroundVehicle getGroundVehicle(String vehicle) {
        return null;
    }

    @Override
    public AirVehicle getAircraftVehicle(String vehicle) {
        AirVehicle airVehicle = null;
        switch (vehicle) {
            case "airplane":
                airVehicle = new Airplane();
                break;

            case "helicopter":
                airVehicle = new Helicopter();
                break;
        }
        return airVehicle;
    }
}
