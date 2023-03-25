package behavioralDesignPatterns.stateDesignPattern;

public class MainStateDesignPattern {
    public static final String home = "HOME pressed";
    public static final String onOff = "ON-OFF pressed";

    public static void main(String[] args) {
        Phone phone = new Phone(); // Off state
        System.out.println(phone.phoneState.onHomePressed()); //  Locked state
        System.out.println(phone.phoneState.onHomePressed()); //  Ready state
        System.out.println(phone.phoneState.onHomePressed()); //  Ready state
        System.out.println(phone.phoneState.onHomePressed()); //  Ready state
        System.out.println(phone.phoneState.onOnOffPressed()); //  Ready state
        System.out.println(phone.phoneState.onOnOffPressed()); //  Ready state
        System.out.println(phone.phoneState.onOnOffPressed()); //  Ready state
    }
}
