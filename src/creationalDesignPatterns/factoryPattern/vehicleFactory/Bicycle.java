package creationalDesignPatterns.factoryPattern.vehicleFactory;

public class Bicycle implements Vehicle{
    @Override
    public void drive() {
        System.out.println("I am driving a bicycle");
    }
}
