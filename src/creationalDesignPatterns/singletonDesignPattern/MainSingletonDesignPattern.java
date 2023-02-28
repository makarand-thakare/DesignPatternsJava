package creationalDesignPatterns.singletonDesignPattern;

public class MainSingletonDesignPattern {
    public static void main(String[] args) {

        // Early Instantiation: creation of instance at load time.
        Sun sunInstance = Sun.getSunInstance();
        sunInstance.raise();


        // Lazy Instantiation: creation of instance when required.
        Moon moonInstance = Moon.getMoonInstance();
        moonInstance.sleep();
    }
}
