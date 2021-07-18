package main.java.com.moloko.javacore.module1_4.chapter11;

/**
 * @author Jack Milk
 */
public class ExtendThread {
    public static void main(String[] args) {
        new NewThread2();

        try {
            for (int i = 5; i >0  ; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");

    }
}

class NewThread2 extends Thread {

    NewThread2() {
        // содать новый поток
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start();
    }

    // Точка входа
    public void run(){
        try {
            for (int i = 5; i >0  ; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}