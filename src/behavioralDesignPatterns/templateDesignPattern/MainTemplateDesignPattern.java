package behavioralDesignPatterns.templateDesignPattern;

public class MainTemplateDesignPattern {
    public static void main(String[] args) {
        Game cricketGame = new CricketGame();
        cricketGame.play();

        System.out.println();

        Game footballGame = new FootballGame();
        footballGame.play();
    }
}
