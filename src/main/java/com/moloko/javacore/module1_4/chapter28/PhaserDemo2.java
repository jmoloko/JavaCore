package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * @author Jack Milk
 */
public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser myPhaser = new MyPhaser(1, 4);

        System.out.println("Запуск потоков\n");
        new MyNewThread(myPhaser, "A");
        new MyNewThread(myPhaser, "B");
        new MyNewThread(myPhaser, "C");

        // ожидать завершения определенного кол-ва фаз
        while (!myPhaser.isTerminated()) {
            myPhaser.arriveAndAwaitAdvance();
        }
        System.out.println("Синхронизатор фаз завершен");
    }
}

// расширить класс MyPhaser, чтобы выполнить только
// определенное кол-во фаз
class MyPhaser extends Phaser {
    private int numPhases;

    public MyPhaser(int parties, int phaseCount){
        super(parties);
        numPhases = phaseCount - 1;
    }

    // переопределить метод onAdvance() чтобы выполнить
    // определенное кол-во фаз
    protected boolean onAdvance(int p, int regParties) {
        System.out.println("Фаза " + p + " завершена \n");

        // возвратить логическое true
        // если фазы завершены
        // в противном случае возвратить false
        return p == numPhases || regParties == 0;
    }
}

// поток исполнения, использующий синхронизатор фаз типа Phaser
class MyNewThread implements Runnable {
    private Phaser ph;
    String name;

    public MyNewThread(Phaser ph, String name) {
        this.ph = ph;
        this.name = name;
        ph.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!ph.isTerminated()){
            System.out.println("Поток " + name + " начинает фазу " + ph.getPhase());
            ph.arriveAndAwaitAdvance();

            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
