package creationalDesignPatterns.singletonDesignPattern;

import creationalDesignPatterns.singletonDesignPattern.singletonClasses.Moon;
import creationalDesignPatterns.singletonDesignPattern.singletonClasses.Sun;

public class MainSingletonDesignPattern {
    public static void main(String[] args) {

        // Early Instantiation: creation of instance at load time.
        Sun sunInstance = Sun.getSunInstance();
        sunInstance.raise();

        Sun sunInstance1 = Sun.getSunInstance();
        Sun sunInstance2 = Sun.getSunInstance();
        Sun sunInstance3 = Sun.getSunInstance();
        System.out.println(sunInstance1);
        System.out.println(sunInstance2);
        System.out.println(sunInstance3);


        // Lazy Instantiation: creation of instance when required.
        Moon moonInstance = Moon.getMoonInstance();
        moonInstance.sleep();

        Moon moonInstance1 = Moon.getMoonInstance();
        Moon moonInstance2 = Moon.getMoonInstance();
        Moon moonInstance3 = Moon.getMoonInstance();
        System.out.println(moonInstance1);
        System.out.println(moonInstance2);
        System.out.println(moonInstance3);
    }
}
