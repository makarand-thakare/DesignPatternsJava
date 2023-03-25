package structuralDesignPatterns.decoratorDesignPattern;

public class CasualDress extends DressDecorator {
    public CasualDress(Dress dress) {
        super(dress);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("casual dress features added");
    }
}
