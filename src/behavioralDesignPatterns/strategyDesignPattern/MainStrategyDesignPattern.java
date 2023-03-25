package behavioralDesignPatterns.strategyDesignPattern;

public class MainStrategyDesignPattern {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("55 + 55 = " + context.executeStrategy(55, 55));

        context = new Context(new OperationMultiply());
        System.out.println("55 * 55 = " + context.executeStrategy(55, 55));

        context = new Context(new OperationSubtract());
        System.out.println("55 - 55 = " + context.executeStrategy(55, 55));

    }
}
