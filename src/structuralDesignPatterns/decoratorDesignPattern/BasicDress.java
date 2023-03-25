package structuralDesignPatterns.decoratorDesignPattern;

public class BasicDress implements Dress {

    @Override
    public void assemble() {
        System.out.println("basic dress features added");
    }
}
