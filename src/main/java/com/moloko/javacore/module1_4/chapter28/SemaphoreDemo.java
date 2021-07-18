package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author Jack Milk
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

// Общий ресурс
class Shared {
    static int count = 0;
}

// Поток исполнения, увеличивающий значение счетчика на единицу
class IncThread implements Runnable {
    private String name;
    private Semaphore sem;

    public IncThread(Semaphore sem, String name){
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            // Сначала получить разрешение
            System.out.println("Поток " + name + " ожидает разрешение");
            sem.acquire();
            System.out.println("Поток " + name + " получил разрешение");

            // получить доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                TimeUnit.MILLISECONDS.sleep(10);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        // освободить разрешение
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}

// Поток исполнения, уменьшающий значение счетчика на единицу
class DecThread implements Runnable {
    private String name;
    private Semaphore sem;

    public DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            // сначала получить разрешение
            System.out.println("Поток " + name + " ожидает разрешение");
            sem.acquire();
            System.out.println("Поток " + name + " получил разрешение");

            // получить доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
                TimeUnit.MILLISECONDS.sleep(10);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        // освободить разрешение
        System.out.println("Поток " + name + " освобождает разрешение");
        sem.release();
    }
}