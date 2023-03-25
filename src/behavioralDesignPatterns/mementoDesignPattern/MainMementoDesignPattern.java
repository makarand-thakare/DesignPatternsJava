package behavioralDesignPatterns.mementoDesignPattern;

public class MainMementoDesignPattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setOriginatorState("State 1");
        originator.setOriginatorState("State 2");
        careTaker.addMemento(originator.saveStateToMemento()); // Save state to careTaker

        originator.setOriginatorState("State 3");
        careTaker.addMemento(originator.saveStateToMemento()); // Save state to careTaker

        originator.setOriginatorState("State 4");

        System.out.println("current state: " + originator.getOriginatorState()); // Check current state

        originator.getStateFromMemento(careTaker.getMemento(0)); // Get a previous state back
        System.out.println("current state: " + originator.getOriginatorState()); // Verify restored state

        originator.getStateFromMemento(careTaker.getMemento(1)); // Get a previous state back
        System.out.println("current state: " + originator.getOriginatorState()); // Verify restored state

    }
}
