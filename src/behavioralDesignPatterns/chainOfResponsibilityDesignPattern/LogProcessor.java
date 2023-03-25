package behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public abstract class LogProcessor {
    public static int DEBUG = 1;
    public static int ERROR = 2;
    public static int INFO = 3;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log(int level, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(level, message);
        }
    }


}
