package main.java.com.moloko.javacore.module1_4.youtube;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Jack Milk
 */
public class ProducerConsumer2{

    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(wn::produce);
        Thread thread2 = new Thread(wn::consume);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class WaitAndNotify{
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() {
        int value = 0;
        while (true){
            synchronized (lock){
                while (queue.size() == LIMIT){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() {
        while (true) {
            synchronized (lock){
                while (queue.size() == 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int value = queue.poll();
                System.out.println("Size queue: " + queue.size() + ", value: " + value);
                lock.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}