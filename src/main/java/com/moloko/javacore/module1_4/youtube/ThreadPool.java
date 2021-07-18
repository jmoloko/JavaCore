package main.java.com.moloko.javacore.module1_4.youtube;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Jack Milk
 */

// Thread Pool - пулл потоков
public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        // создадим пулл из 2-х потоков
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i));
        }

        executorService.shutdown();
        System.out.println("All tasks submitted");

        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
    }
}

class Work implements Runnable{
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was completed" );
    }
}

