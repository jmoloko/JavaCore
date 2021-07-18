package main.java.com.moloko.javacore.module1_4.youtube;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Jack Milk
 */
public class ProducerConsumer {
    // потокобезопасная очередь, размерностью - 10 элементов
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(ProducerConsumer::produce);
        Thread thread2 = new Thread(ProducerConsumer::consumer);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    public static void produce() {

        while (true){
            try {
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consumer(){
        while (true){
            try {

                Thread.sleep(100);
                if (random.nextInt(10) == 5) {
                    System.out.println("Element:  " + queue.take());
                    System.out.println("Queue size:  " + queue.size());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
