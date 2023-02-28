package creationalDesignPatterns.singletonDesignPattern.singletonClasses;

public class Sun {

    // Object will be created at load time
    private static final Sun sunInstance = new Sun();

    private Sun() {
    }

    public static Sun getSunInstance() {
        return sunInstance;
    }

    public void raise() {
        System.out.println("Sun is raising...");
    }
}
