package behavioralDesignPatterns.stateDesignPattern;

public abstract class PhoneState {
    protected Phone phone;

    public PhoneState(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHomePressed();

    public abstract String onOnOffPressed();
}
