package behavioralDesignPatterns.mementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
