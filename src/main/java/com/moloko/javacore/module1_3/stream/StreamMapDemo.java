package main.java.com.moloko.javacore.module1_3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Jack Milk
 */
public class StreamMapDemo {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);

        Stream<Double> sqrtStream = list.stream().map(Math::sqrt);
        double sqrtProd = sqrtStream.reduce(1.0, (a, b) -> a*b);
        System.out.println("Произведение квадратных корней равно: " + sqrtProd);

    }
}
