package ChainOfResponsibility_Design_Pattern;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    void log(int logLvl, String message) {
        if(logLvl==DEBUG) {
            System.out.println("Debug log level message: " + message);
        } else {
            super.log(logLvl, message);
        }
    }
}
