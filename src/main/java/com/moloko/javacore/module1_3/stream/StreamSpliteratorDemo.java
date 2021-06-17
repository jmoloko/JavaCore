package main.java.com.moloko.javacore.module1_3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 * @author Jack Milk
 */
public class StreamSpliteratorDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Альфа");
        list.add("Бета");
        list.add("Гамма");
        list.add("Дельта");
        list.add("Кси");
        list.add("Омега");

        // получить поток данных из списочного массива
        Stream<String> stream = list.stream();

        // получить итератор для потока данных
        Spliterator<String> spitr = stream.spliterator();

        // перебрать элементы в потоке данных c методом tryAdvance
        while (spitr.tryAdvance(System.out::println));

        System.out.println();

        // перебрать элементы в потоке данных c методом forEachRemaining
        stream = list.stream();
        spitr = stream.spliterator();
        spitr.forEachRemaining(System.out::println);


    }
}
