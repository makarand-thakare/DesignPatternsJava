package creationalDesignPatterns.builderDesignPattern;

public class PhoneBuilder {
    String ramSize = "16GB";
    String operatingSystem = "iOS";
    String storage = "1TB";
    String screenSize = "6 inch";
    boolean fingerPrintSensor = true;

    public Phone buildPhone() {
        return new Phone(ramSize, operatingSystem, storage, screenSize, fingerPrintSensor);
    }

    public PhoneBuilder setRamSize(String ramSize) {
        this.ramSize = ramSize;
        return this;
    }

    public PhoneBuilder setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public PhoneBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setFingerPrintSensor(boolean fingerPrintSensor) {
        this.fingerPrintSensor = fingerPrintSensor;
        return this;
    }
}
