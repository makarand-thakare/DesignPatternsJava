package creationalDesignPatterns.builderDesignPattern;

public class Phone {
    String ramSize;
    String operatingSystem;
    String storage;
    String screenSize;
    Boolean fingerPrintSensor;

    public Phone(String ramSize, String operatingSystem, String storage,
                 String screenSize, Boolean fingerPrintSensor) {
        this.ramSize = ramSize;
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.screenSize = screenSize;
        this.fingerPrintSensor = fingerPrintSensor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ramSize='" + ramSize + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", storage='" + storage + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", fingerPrintSensor=" + fingerPrintSensor +
                '}';
    }
}