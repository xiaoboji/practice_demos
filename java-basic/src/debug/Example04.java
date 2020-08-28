package debug;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author JH
 */
public class Example04 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable r1 = () -> {
            System.out.println("This thread :" + Thread.currentThread().getName());
            System.out.println("-----------A-----------");
        };
        Runnable r2 = () -> {
            System.out.println("This thread :" + Thread.currentThread().getName());
            System.out.println("-----------B-----------");
        };
        Runnable r3 = () -> {
            System.out.println("This thread :" + Thread.currentThread().getName());
            System.out.println("-----------C-----------");
        };

        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);

        System.out.println("-----------Over-----------");

        executorService.shutdown();
    }
}
