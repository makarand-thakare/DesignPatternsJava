package behavioralDesignPatterns.chainOfResponsibilityDesignPattern;

public class MainChainOfResponsibilityDesignPattern {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.DEBUG, "This is debug message");
        logProcessor.log(LogProcessor.ERROR, "Exception occurred!!");
        logProcessor.log(LogProcessor.INFO, "this is info message");
    }
}
