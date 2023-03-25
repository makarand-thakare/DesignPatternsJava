package structuralDesignPatterns.decoratorDesignPattern;

public class TraditionalDress extends DressDecorator {
    public TraditionalDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("traditional dress features added");
    }
}
