package main.java.com.moloko.javacore.module1_3.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack Milk
 */
public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);

        double prodSqr = list.parallelStream().reduce(1.0,
                                                        (a, b) -> a * Math.sqrt(b),
                                                        (a, b) -> a*b);
        System.out.println("Произведение квадратных корней элементов списка: " + prodSqr);
    }
}
