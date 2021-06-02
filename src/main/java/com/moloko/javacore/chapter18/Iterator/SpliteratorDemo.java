package main.java.com.moloko.javacore.chapter18.Iterator;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Spliterator;

/**
 * @author Jack Milk
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        // Создать списочный массив числовых значений типа Double
        ArrayList<Double> vals = new ArrayList<>();

        // Ввести значения в списочный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Вызвать метод tryAdvance() для вывода содержимого
        // списочного массива vals
        System.out.println("Содержимое списочного массива vals: ");
        Spliterator<Double> sptitr = vals.spliterator();
        while (sptitr.tryAdvance(n -> System.out.println(n)));
        System.out.println();

        // Создать новый списочный массив, содержащий квадратные
        // корни числовых значений из массива vals
        sptitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (sptitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        // вызвать метод ForEachRemaining() для вывода содержимого
        // списрчного массива sqrs
        System.out.println("Содержимое списочного ассива sqrs: ");
        sptitr = sqrs.spliterator();
        sptitr.forEachRemaining(n -> System.out.println(n));
        System.out.println();
    }
}
