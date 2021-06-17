package main.java.com.moloko.javacore.module1_3.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Jack Milk
 */
public class StreamIteratorDemo {
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
        Iterator<String> itr = stream.iterator();

        // перебрать элементы в потоке данных
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
