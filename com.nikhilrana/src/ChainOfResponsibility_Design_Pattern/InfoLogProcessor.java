package ChainOfResponsibility_Design_Pattern;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    void log(int logLvl, String message) {
        if(logLvl==INFO) {
            System.out.println("Info log level processor message: " + message);
        } else {
            super.log(logLvl, message);
        }
    }
}
