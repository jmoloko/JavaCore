package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.Semaphore;

/**
 * @author Jack Milk
 */
public class ProdConSemaphore {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}

class Q {
    private int n;

    // начать с недоступного семафора потребителя
    private static Semaphore semCon = new Semaphore(0);
    private static Semaphore semProd = new Semaphore(1);

    public void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Получено: " + n);
        semProd.release();
    }

    public void put(int n) {
        try {
            semProd.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Отправленно: " + n);
        semCon.release();
    }
}

class Producer implements Runnable {
    private Q q;

    public Producer(Q q){
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            q.put(i);
        }
    }
}

class Consumer implements Runnable {
    private Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}