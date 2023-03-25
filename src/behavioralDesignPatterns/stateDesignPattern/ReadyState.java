package behavioralDesignPatterns.stateDesignPattern;

public class ReadyState extends PhoneState {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHomePressed() {
        System.out.println(MainStateDesignPattern.home);
        return phone.home();
    }

    @Override
    public String onOnOffPressed() {
        System.out.println(MainStateDesignPattern.onOff);
        phone.setPhoneState(new OffState(phone));
        return phone.lock();
    }
}
