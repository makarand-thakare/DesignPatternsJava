package behavioralDesignPatterns.commandDesignPattern;

public class SellStock implements Order {
    AndroidStock androidStock;

    public SellStock(AndroidStock androidStock) {
        this.androidStock = androidStock;
    }

    @Override
    public void execute() {
        androidStock.sellStock();
    }
}
