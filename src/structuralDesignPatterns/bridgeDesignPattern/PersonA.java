package structuralDesignPatterns.bridgeDesignPattern;

public class PersonA extends Human {
    public PersonA(HumansActions humansActions) {
        super(humansActions);
    }

    @Override
    public void humanTravel() {
        humansActions.travel();
    }
}
