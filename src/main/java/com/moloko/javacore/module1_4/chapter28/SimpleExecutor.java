package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jack Milk
 */
public class SimpleExecutor {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl1 = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);

        ExecutorService es = Executors.newFixedThreadPool(2);

        // запуск потоков
        System.out.println("Запуск потоков");
        es.execute(new SimpleThread(cdl1, "A"));
        es.execute(new SimpleThread(cdl2, "B"));
        es.execute(new SimpleThread(cdl3, "C"));
        es.execute(new SimpleThread(cdl4, "D"));

        cdl1.await();
        cdl2.await();
        cdl3.await();
        cdl4.await();

        es.shutdown();
        System.out.println("Завершение потоков");
    }
}

class SimpleThread implements Runnable {
    private String name;
    private CountDownLatch latch;

    public SimpleThread(CountDownLatch latch, String name) {
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
