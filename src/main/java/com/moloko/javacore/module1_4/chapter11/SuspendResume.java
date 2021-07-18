package main.java.com.moloko.javacore.module1_4.chapter11;

/**
 * @author Jack Milk
 */
public class SuspendResume {
    public static void main(String[] args) {
        NewThread4 nt1 = new NewThread4("Первый");
        NewThread4 nt2 = new NewThread4("Второй");

        try {
            Thread.sleep(1000);
            nt1.mySuspend();
            System.out.println("Приостанова потока 'Первый'");
            Thread.sleep(1000);
            nt1.myResume();
            System.out.println("Возобновление потока 'Первый'");

            nt2.mySuspend();
            System.out.println("Приостанова потока 'Второй'");
            Thread.sleep(1000);
            nt2.myResume();
            System.out.println("Возобновление потока 'Второй'");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        try {
            System.out.println("Ожидание завершения потоков");
            nt1.t.join();
            nt2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}

class NewThread4 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread4(String threadName) {
        name = threadName;
        t = new Thread(this, threadName);
        System.out.println("Новы поток: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}
