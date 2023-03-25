package behavioralDesignPatterns.stateDesignPattern;

public class OffState extends PhoneState {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHomePressed() {
        System.out.println(MainStateDesignPattern.home);
        phone.setPhoneState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOnOffPressed() {
        System.out.println(MainStateDesignPattern.onOff);
        phone.setPhoneState(new LockedState(phone));
        return phone.turnOn();
    }
}
