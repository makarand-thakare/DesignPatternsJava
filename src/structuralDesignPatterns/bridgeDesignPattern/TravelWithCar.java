package structuralDesignPatterns.bridgeDesignPattern;

public class TravelWithCar implements HumansActions {

    @Override
    public void travel() {
        System.out.println("Travelling with car");
    }
}
