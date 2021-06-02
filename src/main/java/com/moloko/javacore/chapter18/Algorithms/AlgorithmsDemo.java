package main.java.com.moloko.javacore.chapter18.Algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @author Jack Milk
 */
public class AlgorithmsDemo {
    public static void main(String[] args) {
        // Создать не инициализированный связный список
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // создать comparator с обратным упорядочиванием
        Comparator<Integer> r = Collections.reverseOrder();

        // отсортировать список с помощью этого компоратора
//        ll.sort(r);
        Collections.sort(ll, r);
        System.out.println("Список отсортирован в обраном порядке: " + ll);

        // перетасовать список
        Collections.shuffle(ll);
        System.out.println("Список перетасован: " + ll);

        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));

    }
}
