package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.CountDownLatch;

/**
 * @author Jack Milk
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(5);
        System.out.println("Запуск потока исполнения");
        new MyThread(count);

        try {
            count.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потока исполнеия");
    }
}

class MyThread implements Runnable {
    private CountDownLatch latch;

    public MyThread(CountDownLatch latch){
        this.latch = latch;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }

}
