package main.java.com.moloko.javacore.module1_3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Jack Milk
 */
public class StreamReduceDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(18);
        list.add(10);
        list.add(24);
        list.add(17);
        list.add(5);

        // два способа получения результата перемножения элнментов списка
        Optional<Integer> prod1 = list.stream().reduce((a, b) -> a * b);
        prod1.ifPresent(i -> System.out.println("Произведение в виде объекта Optional: " + i));

        int prod2 = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Произведение в виде значения типа int: " + prod2);

        // получить произведение только четных элементов списка
        int even = list.stream().reduce(1, (a, b) -> b%2 == 0 ? a*b : a);
        System.out.println("Произведение всех четных элементов списка в виде int: " + even);

        // паралельное вычисление результата перемножения элементов списка
        int parallel = list.parallelStream().reduce(1, (a, b) -> a*b, (a, b) -> a*b);
        System.out.println("Паралельное вычисление произведения в виде значения типа int: " + parallel);

    }
}
