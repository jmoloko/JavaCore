package main.java.com.moloko.javacore.module1_3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Jack Milk
 */
public class StreamMapToIntDemo {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(1.1);
        list.add(3.6);
        list.add(9.2);
        list.add(4.7);
        list.add(12.1);
        list.add(5.0);

        System.out.print("Исходные значения списка list: ");
        list.forEach(n -> System.out.print(n + " "));
        System.out.println();

        IntStream intStream = list.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.print("Максимально допустимые пределы значений из списка list: ");
        intStream.forEach(a -> System.out.print(a + " "));
    }
}
