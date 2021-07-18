package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Jack Milk
 */
public class AtomicDemo {
    public static void main(String[] args) {
        new AtomicThread("A");
        new AtomicThread("B");
        new AtomicThread("C");
    }
}

class AtomicShared {
    public static AtomicInteger ai = new AtomicInteger(0);
}

class AtomicThread implements Runnable {
    private String name;

    public AtomicThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока");
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Поток " + name + " получено: " + AtomicShared.ai.getAndSet(i));
        }
    }
}