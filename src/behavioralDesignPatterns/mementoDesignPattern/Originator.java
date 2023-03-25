package behavioralDesignPatterns.mementoDesignPattern;

public class Originator {
    private String originatorState;

    public String getOriginatorState() {
        return originatorState;
    }

    public void setOriginatorState(String originatorState) {
        this.originatorState = originatorState;
    }

    public Memento saveStateToMemento() {
        return new Memento(originatorState);
    }

    public void getStateFromMemento(Memento memento) {
        originatorState = memento.getState();
    }
}
