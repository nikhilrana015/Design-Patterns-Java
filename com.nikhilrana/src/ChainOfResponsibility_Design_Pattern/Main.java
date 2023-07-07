package ChainOfResponsibility_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));
        logProcessor.log(2, "Debugging the message");
        logProcessor.log(3, "Working on Error");
        logProcessor.log(7, "No such log level");
        logProcessor.log(1, "Info log level message");

    }
}
