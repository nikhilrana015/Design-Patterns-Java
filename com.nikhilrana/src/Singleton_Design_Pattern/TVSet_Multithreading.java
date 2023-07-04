package Singleton_Design_Pattern;

public class TVSet_Multithreading {
    private static volatile TVSet_Multithreading tvSetMultithreadingInstance;
    private TVSet_Multithreading() {
        System.out.println("TVSet_Multithreading Instance is created");
    }
    public static TVSet_Multithreading getTvSetMultithreadingInstance() {
        if(tvSetMultithreadingInstance==null) {
            synchronized (TVSet_Multithreading.class) {
                if(tvSetMultithreadingInstance==null)   // double check to prevent multiple instances
                    tvSetMultithreadingInstance = new TVSet_Multithreading();
            }
        }
        return tvSetMultithreadingInstance;
    }
}
