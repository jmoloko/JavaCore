package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * @author Jack Milk
 */
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser ph = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");
        new NewMyThread(ph, "A");
        new NewMyThread(ph, "B");
        new NewMyThread(ph, "C");

        // ожидать завершения всеми потоками исполнения первой фазы
        curPhase = ph.getPhase();
        ph.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидать завершения всеми потоками исполнения второй фазы
        curPhase = ph.getPhase();
        ph.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // ожидать завершения всеми потоками исполнения третьей фазы
        curPhase = ph.getPhase();
        ph.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // cнять основной поток исполнения с регистрации
        ph.arriveAndDeregister();

        if (ph.isTerminated()){
            System.out.println("Синхронизатор фаз завершен");
        }
    }
}

// Поток исполнения, использующий синхронизатор фаз типа Phaser
class NewMyThread implements Runnable{
    private Phaser phaser;
    private String name;

    public NewMyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance(); // известить о достижении фазы

        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance(); // известить о достижении фазы

        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phaser.arriveAndDeregister(); // известить о достижении фазы и снять потоки с регистрации

    }
}