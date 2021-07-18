package main.java.com.moloko.javacore.module1_4.chapter28;

import java.util.concurrent.*;

/**
 * @author Jack Milk
 */
public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> sum;
        Future<Double> hypo;
        Future<Integer> fact;

        System.out.println("Запуск");

        sum = es.submit(new Sum(10));
        hypo = es.submit(new Hypot(3, 4));
        fact = es.submit(new Factorial(5));

        try {
            System.out.println(sum.get());
            System.out.println(hypo.get());
            System.out.println(fact.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Завершение");

    }
}

// три потока исполнения вычислений
class Sum implements Callable<Integer> {
    private int stop;

    public Sum(int s) {
        stop = s;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypot implements Callable<Double> {
    private double side1, side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial implements Callable<Integer> {
    private int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}