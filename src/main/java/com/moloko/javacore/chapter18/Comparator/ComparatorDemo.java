package main.java.com.moloko.javacore.chapter18.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Jack Milk
 */
class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        // Выполнить сравнение в обратном порядке
        return b.compareTo(a);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        // Создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        // Ввести элементы в множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Вывести эл. из множества
        for (String el: ts){
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
