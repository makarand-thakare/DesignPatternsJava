package structuralDesignPatterns.bridgeDesignPattern;

public class MainBridgeDesignPattern {

    public static void main(String[] args) {
        Human personA = new PersonA(new TravelWithBike());
        personA.humanTravel();

        Human personB = new PersonB(new TravelWithCar());
        personB.humanTravel();
    }

}
