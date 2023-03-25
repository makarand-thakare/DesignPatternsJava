package behavioralDesignPatterns.stateDesignPattern;

public class Phone {
    PhoneState phoneState;

    public Phone() {
        phoneState = new OffState(this);
    }

    public void setPhoneState(PhoneState phoneState) {
        this.phoneState = phoneState;
    }

    public String lock() {
        return "Locking phone and turning off the screen";
    }

    public String home() {
        return "Going to home screen";
    }

    public String unlock() {
        return "Unlocking the phone to home";
    }

    public String turnOn() {
        return "Turning on screen, device is still locked";
    }
}
