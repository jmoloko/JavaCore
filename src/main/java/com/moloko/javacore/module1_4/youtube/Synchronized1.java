package main.java.com.moloko.javacore.module1_4.youtube;

/**
 * @author Jack Milk
 */
public class Synchronized1 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Synchronized1 sync = new Synchronized1();
        sync.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                counter++;
                increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                counter++;
                increment();
            }
        });

        thread1.start();
        thread2.start();

        // ждем пока оба потока закончат своюработу
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

    // для synchronized нужен объект и монитор
    // у всех объектов есть монитор
    // монитор в один момент времени может принадлежать только одному потоку
    // в данном случае мы явно не указываем объект
    // на котором будем синхронизироваться потому что синхронизация на this.
    private synchronized void  increment() {
        counter++;
    }
}
