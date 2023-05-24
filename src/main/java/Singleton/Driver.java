package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public static void main(String[] args) {
       /* TvSet tv1 = TvSet.getTvSet();
        System.out.println(tv1);

        TvSet tv2 = TvSet.getTvSet();
        System.out.println(tv2);*/

        System.out.println("Multi threaded env ..");
        ExecutorService executor= Executors.newFixedThreadPool(2);
        executor.execute(() -> TvSet.getTvSet());
        executor.execute(() -> TvSet.getTvSet());
        executor.shutdown();
    }
}
