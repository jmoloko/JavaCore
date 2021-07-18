package main.java.com.moloko.javacore.module1_4.youtube;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author Jack Milk
 */
public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();

        for (int i = 0; i < 200; i++)
            executorService.submit(connection::work);

        executorService.shutdown();
        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);

    }
}

 class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection(){}

    public static Connection getConnection(){
        return connection;
    }

    public void work() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() {
        synchronized (this){
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this){
            connectionsCount--;
        }

    }
 }