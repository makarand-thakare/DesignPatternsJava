package behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int level, String message) {
        if (level == ERROR) {
            System.out.println("Error:: " + message);
        } else {
            super.log(level, message);
        }
    }
}
