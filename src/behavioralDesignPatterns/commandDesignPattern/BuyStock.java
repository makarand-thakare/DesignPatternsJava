package behavioralDesignPatterns.commandDesignPattern;

public class BuyStock implements Order {
    AndroidStock androidStock;

    public BuyStock(AndroidStock androidStock) {
        this.androidStock = androidStock;
    }

    @Override
    public void execute() {
        androidStock.buyStock();
    }
}
