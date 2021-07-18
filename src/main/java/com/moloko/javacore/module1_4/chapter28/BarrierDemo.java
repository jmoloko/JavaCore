package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Jack Milk
 */
public class BarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new NewThread(cb, "A");
        new NewThread(cb, "B");
        new NewThread(cb, "C");
        new NewThread(cb, "X");
        new NewThread(cb, "Y");
        new NewThread(cb, "Z");
    }
}

// поток исполнения использующий барьер типа CyclicBarrier
class NewThread implements Runnable {
    private CyclicBarrier cb;
    private String name;

    public NewThread(CyclicBarrier cb, String name) {
        this.cb = cb;
        this.name = name;
        new Thread(this).start();
    }

    public void run() {
        System.out.println(name);
        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

// Объект этого класса вызывается по дочтижении
// барьъера типа CyclicBarrier
class BarAction implements Runnable {
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}