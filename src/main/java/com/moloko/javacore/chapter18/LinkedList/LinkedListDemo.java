package main.java.com.moloko.javacore.chapter18.LinkedList;

import java.util.*;

/**
 * @author Jack Milk
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // Создать связный список
        LinkedList<String> ll = new LinkedList<>();

        // Ввести элементы в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Исходное содержимое связного списка ll: " + ll);

        // Удалить элементы из связного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое связного списка ll после удаления элементов: " + ll);

        // Удалить первый и последний элменты связного списка
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Содержимое связного списка ll после удаления первого и последнего элементов: " + ll);

        // Получить и присвоить значение
        ll.set(2, ll.get(2) + " изменено");
        System.out.println("Содержимое связного списка ll после изменения: " + ll);
    }

}
