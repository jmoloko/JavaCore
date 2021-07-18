package main.java.com.moloko.javacore.module1_4.chapter11;

/**
 * @author Jack Milk
 */
public class Synch {
    public static void main(String[] args) throws InterruptedException {
        CallMe target = new CallMe();
        Caller call1 = new Caller(target, "Добро пожалоавать");
        Caller call2 = new Caller(target, "в синзронизированный");
        Caller call3 = new Caller(target, "мир!");


        call1.t.join();
        call2.t.join();
        call3.t.join();
    }
}

class CallMe {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.print("]");
    }
}

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
