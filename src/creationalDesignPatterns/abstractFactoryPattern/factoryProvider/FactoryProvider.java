package creationalDesignPatterns.abstractFactoryPattern.factoryProvider;

import creationalDesignPatterns.abstractFactoryPattern.airVehicles.AircraftVehicleFactory;
import creationalDesignPatterns.abstractFactoryPattern.groundVehicles.GroundVehicleFactory;

public class FactoryProvider {

    public AbstractFactory getVehicleFactory(String factoryType) {
        AbstractFactory factory = null;
        switch (factoryType) {
            case "airVehicleFactory":
                factory = new AircraftVehicleFactory();
                break;

            case "groundVehicleFactory":
                factory = new GroundVehicleFactory();
                break;
        }
        return factory;
    }

}
