package ChainOfResponsibility_Design_Pattern;

public abstract class LogProcessor {
    private LogProcessor nextLogProcessor;
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    void log(int logLvl, String message) {
        if(nextLogProcessor!=null) {
            nextLogProcessor.log(logLvl, message);
        } else {
            System.out.println(message);
        }
    }
}
