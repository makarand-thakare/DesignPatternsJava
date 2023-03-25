package structuralDesignPatterns.bridgeDesignPattern;

public class PersonB extends Human {
    public PersonB(HumansActions humansActions) {
        super(humansActions);
    }

    @Override
    public void humanTravel() {
        humansActions.travel();
    }
}
