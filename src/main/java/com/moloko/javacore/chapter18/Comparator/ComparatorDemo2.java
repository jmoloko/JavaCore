package main.java.com.moloko.javacore.chapter18.Comparator;

import java.util.TreeSet;

/**
 * @author Jack Milk
 */
public class ComparatorDemo2 {
    public static void main(String[] args) {
        // Передать comparator с обратным упорядочением
        TreeSet<String> tset = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        // Ввести элементы в множество
        tset.add("C");
        tset.add("A");
        tset.add("B");
        tset.add("E");
        tset.add("F");
        tset.add("D");

        // Вывести эл. из множества
        for (String el: tset){
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
