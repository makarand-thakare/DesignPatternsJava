package creationalDesignPatterns.abstractFactoryPattern.factoryProvider;

import creationalDesignPatterns.abstractFactoryPattern.airVehicles.AirVehicle;
import creationalDesignPatterns.abstractFactoryPattern.groundVehicles.GroundVehicle;

public abstract class AbstractFactory {
    public abstract GroundVehicle getGroundVehicle(String vehicle);
    public abstract AirVehicle getAircraftVehicle(String vehicle);
}
