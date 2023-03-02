package creationalDesignPatterns.builderDesignPattern;

public class MainBuilderDesignPattern {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        phoneBuilder.setOperatingSystem("Android");
        phoneBuilder.setStorage("64GB");

        Phone phone = phoneBuilder.buildPhone();
        System.out.println(phone.toString());
    }
}
