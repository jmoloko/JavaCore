package main.java.com.moloko.javacore.module1_4.chapter11;

/**
 * @author Jack Milk
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}

// создать второй поток исполнения
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // создать новый, второй поток исполнения
        t = new Thread(this, "Новый поток исполнения");
        System.out.println("Дочерний поток создан: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}