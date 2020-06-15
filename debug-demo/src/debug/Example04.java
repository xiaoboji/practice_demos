package debug;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example04 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable r1 = () -> {
            System.out.println("This thread :" + Thread.currentThread().getName());
            System.out.println("AAAAAAAAAAAAAAAAAAA");
        };
        Runnable r2 = () -> {
            System.out.println("This thread :" + Thread.currentThread().getName());
            System.out.println("BBBBBBBBBBBBBBBBBBB");
        };
        Runnable r3 = () -> {
            System.out.println("This thread :" + Thread.currentThread().getName());
            System.out.println("CCCCCCCCCCCCCCCCCCC");
        };

        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);

        System.out.println("Main");
        executorService.shutdown();
    }
}
