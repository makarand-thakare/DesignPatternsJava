package behavioralDesignPatterns.commandDesignPattern;

public class AndroidStock {
    String stockName = "Android";
    int quantity = 1000;

    public void buyStock() {
        System.out.println("Buying stock " + stockName + ". Quantity " + quantity);
    }

    public void sellStock() {
        System.out.println("Selling stock " + stockName + ". Quantity " + quantity);
    }
}
