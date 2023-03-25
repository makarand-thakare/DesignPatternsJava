package behavioralDesignPatterns.templateDesignPattern;

public abstract class Game {
    public abstract void initialise();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        initialise();
        startPlay();
        endPlay();
    }
}
