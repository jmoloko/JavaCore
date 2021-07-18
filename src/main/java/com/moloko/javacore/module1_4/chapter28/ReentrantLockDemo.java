package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Jack Milk
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

// Общий ресурс
class SharedCount {
    public static int count = 0;
}

// поток исполнения инкрементирующий значение счетчика
class LockThread implements Runnable {
    private String name;
    ReentrantLock lock;

    public LockThread(ReentrantLock lock, String name) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            // сначала заблокировать счетчик
            System.out.println("Поток " + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток " + name + " блокирует счетчик");
            Shared.count++;
            System.out.println("Поток " + name + ": " + Shared.count);

            // Переключение контекста, если это возможно
            System.out.println("Поток " + name + " ожидает");
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Снять блокировку
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }
    }
}