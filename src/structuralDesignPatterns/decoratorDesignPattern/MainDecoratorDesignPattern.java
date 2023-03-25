package structuralDesignPatterns.decoratorDesignPattern;

public class MainDecoratorDesignPattern {
    public static void main(String[] args) {
        Dress fancyTraditionalDress = new FancyDress(new TraditionalDress(new BasicDress()));
        fancyTraditionalDress.assemble();

        System.out.println("*************************");

        Dress fancyCasualDress = new FancyDress(new CasualDress(new BasicDress()));
        fancyCasualDress.assemble();
    }
}
