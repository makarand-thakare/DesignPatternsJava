package structuralDesignPatterns.bridgeDesignPattern;

public abstract class Human {
    HumansActions humansActions;

    public Human(HumansActions humansActions) {
        this.humansActions = humansActions;
    }

    abstract public void humanTravel();
}
