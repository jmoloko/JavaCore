package main.java.com.moloko.javacore.module1_3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Jack Milk
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Исходный список: " + myList);

        // получить поток элементов списочного массива
        Stream<Integer> myStream = myList.stream();

        // получить минимальное значение
//        Optional<Integer> min = myStream.min(Integer::compare);
        Optional<Integer> min = myList.stream().min(Integer::compare);
        min.ifPresent(integer -> System.out.println("Мимнммальное значение: " + integer));

        // получить новый поток данных
        // поскольку поток закончился на методе min
        myStream = myList.stream();

        // получить максимальное значение
        Optional<Integer> max = myStream.max(Integer::compare);
        max.ifPresent(i -> System.out.println("Максимальное значение: " + i));

        // отсоритровать поток данных
        Stream<Integer> sortedStream = myList.stream().sorted();

        // отобразить отсортированный поток
        System.out.print("Отсортированный поток данных: ");
//        sortedStream.forEach(n -> System.out.print(n + " "));
        myList.stream().
                sorted().
                forEach(n -> System.out.print(n + " "));
        System.out.println();

        // вывести только нечетные значения
        Stream<Integer> oddVal = myList.stream().sorted().filter(n -> n % 2 != 0);
        System.out.print("Нечетные значения: ");
//        oddVal.forEach(n -> System.out.print(n + " "));
        myList.stream().
                sorted().
                filter(n -> n % 2 != 0).
                forEach(n -> System.out.print(n + " "));
        System.out.println();

        // вывести нечетные значения больше 5
        oddVal = myList.stream().sorted().filter(n -> (n % 2 != 0) && (n > 5));
        System.out.print("Нечетные значения больше 5: ");
        oddVal.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> stream = myList.stream();
        long count = stream.count();
        System.out.println(count);

    }
}
