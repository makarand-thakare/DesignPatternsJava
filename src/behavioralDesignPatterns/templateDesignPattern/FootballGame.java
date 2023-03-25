package behavioralDesignPatterns.templateDesignPattern;

public class FootballGame extends Game{
    @Override
    public void initialise() {
        System.out.println("Football game: starting...");
    }

    @Override
    public void startPlay() {
        System.out.println("Football game: is in progress");
    }

    @Override
    public void endPlay() {
        System.out.println("Football game: ended");
    }
}
