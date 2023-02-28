package creationalDesignPatterns.singletonDesignPattern;

public class Moon {
    private static Moon moonInstance;

    private Moon() {
    }

    public static Moon getMoonInstance() {
        if (moonInstance == null) {
            synchronized (Moon.class) {
                // Object will be created when it's requested
                moonInstance = new Moon();
            }
        }
        return moonInstance;
    }

    public void sleep() {
        System.out.println("Moon is sleeping...");
    }
}
