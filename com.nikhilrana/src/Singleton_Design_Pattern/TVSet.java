package Singleton_Design_Pattern;

public class TVSet {
    private static TVSet tvSetInstance = null;
    private TVSet() {
        System.out.println("TVSet Instance is created");
    }
    public static TVSet getTVSetInstance() {
        if(tvSetInstance==null) {
            tvSetInstance = new TVSet();
        }
        return tvSetInstance;
    }
}
