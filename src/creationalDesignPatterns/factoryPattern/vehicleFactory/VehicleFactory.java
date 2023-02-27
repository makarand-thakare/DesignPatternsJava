package creationalDesignPatterns.factoryPattern.vehicleFactory;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        Vehicle vehicle = null;

        switch (vehicleType) {
            case "car":
                vehicle = new Car();
                break;

            case "bike":
                vehicle = new Bike();
                break;

            case "bicycle":
                vehicle = new Bicycle();
                break;
        }
        return vehicle;
    }

}
