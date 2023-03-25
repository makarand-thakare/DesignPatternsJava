package behavioralDesignPatterns.stateDesignPattern;

public class LockedState extends PhoneState {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHomePressed() {
        System.out.println(MainStateDesignPattern.home);
        phone.setPhoneState(new ReadyState(phone));
        return phone.unlock();
    }

    @Override
    public String onOnOffPressed() {
        System.out.println(MainStateDesignPattern.onOff);
        phone.setPhoneState(new OffState(phone));
        return phone.lock();
    }
}
