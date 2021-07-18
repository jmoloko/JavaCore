package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.Exchanger;

/**
 * @author Jack Milk
 */
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}

// поток типа Thread формирующий символьную строку
class MakeString implements Runnable {
    private Exchanger<String> ex;
    private String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        str = new String();
        new Thread(this).start();
    }

    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            // заполнить буфер
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                // обменять заполненный буфер на пустой
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// поток типа Thread использующий символьную строку
class UseString implements Runnable {
    private Exchanger<String> ex;
    private String str;

    public UseString(Exchanger<String> ex) {
        this.ex = ex;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.println("Получено: " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
