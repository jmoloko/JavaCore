package main.java.com.moloko.javacore.module1_4.youtube;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Jack Milk
 */
public class Synchronized2 {
    public static void main(String[] args) throws InterruptedException {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();

    // объекты для синхронизации
    Object lock1 = new Object();
    Object lock2 = new Object();


    // можно синхронизоваться на  list1, list2
    // это ведь тоже объекты с монитором
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (list1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (list2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work(){
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(this::work);
        Thread thread2 = new Thread(this::work);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");

        System.out.println("List1 : " + list1.size());
        System.out.println("List2 : " + list2.size());
    }
}