package main.java.com.moloko.javacore.module1_4.youtube;

import java.util.Scanner;

/**
 * @author Jack Milk
 */
public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        ProduceConsume pc = new ProduceConsume();

        Thread thread1 = new Thread(pc::produce);
        Thread thread2 = new Thread(pc::consume);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class ProduceConsume{
    public void produce() {
        synchronized (this){
            System.out.println("Producer thread started...");
            try {
                // метод wait вызывается только в пределах
                // synchronized блока и на синхронизированном объекте
                // в данном случае вызывается на объекте this (т.е. pc)
                // this.wait();
                // если синхронизация будет на другом объекте типа lock
                // lock.wait()
                wait(); // 1 - отдаем intrinsic block, 2 - ждем пока будет вызван notify() именно на этом объекте
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() {
        try {
            Thread.sleep(2000);
            Scanner scanner = new Scanner(System.in);
            synchronized (this) {
                System.out.println("Waiting for Enter key pressed ");
                scanner.nextLine();
                notify(); // notify не освобождает монитор

                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}