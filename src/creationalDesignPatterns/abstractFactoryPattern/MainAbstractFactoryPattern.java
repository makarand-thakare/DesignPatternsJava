package creationalDesignPatterns.abstractFactoryPattern;

import creationalDesignPatterns.abstractFactoryPattern.airVehicles.AirVehicle;
import creationalDesignPatterns.abstractFactoryPattern.factoryProvider.AbstractFactory;
import creationalDesignPatterns.abstractFactoryPattern.factoryProvider.FactoryProvider;
import creationalDesignPatterns.abstractFactoryPattern.groundVehicles.GroundVehicle;

public class MainAbstractFactoryPattern {
    public static void main(String[] args) {

        FactoryProvider factoryProvider = new FactoryProvider();

        AbstractFactory airVehicleFactory = factoryProvider.getVehicleFactory("airVehicleFactory");
        AirVehicle airplane = airVehicleFactory.getAircraftVehicle("airplane");
        airplane.fly();

        AbstractFactory groundVehicleFactory = factoryProvider.getVehicleFactory("groundVehicleFactory");
        GroundVehicle car = groundVehicleFactory.getGroundVehicle("car");
        car.drive();
    }
}
