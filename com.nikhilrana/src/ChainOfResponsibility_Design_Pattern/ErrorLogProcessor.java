package ChainOfResponsibility_Design_Pattern;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    void log(int logLvl, String message) {
        if(logLvl==ERROR) {
            System.out.println("Error log processor message: " + message);
        } else {
            super.log(logLvl, message);
        }
    }
}
