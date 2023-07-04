package Singleton_Design_Pattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        // This TVSet works with single thread but fails when we have multiple threads
        TVSet tvSet1 = TVSet.getTVSetInstance();
        TVSet tvSet2 = TVSet.getTVSetInstance();
        System.out.println(tvSet1);
        System.out.println(tvSet2);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(()->TVSet_Multithreading.getTvSetMultithreadingInstance());
        executorService.execute(()->TVSet_Multithreading.getTvSetMultithreadingInstance());
        executorService.execute(()->TVSet_Multithreading.getTvSetMultithreadingInstance());
        executorService.execute(()->TVSet_Multithreading.getTvSetMultithreadingInstance());
        executorService.execute(()->TVSet_Multithreading.getTvSetMultithreadingInstance());


    }
}
