package behavioralDesignPatterns.templateDesignPattern;

public class CricketGame extends Game{
    @Override
    public void initialise() {
        System.out.println("Cricket game: starting...");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket game: is in progress");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket game: ended");
    }
}
