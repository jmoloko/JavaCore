package main.java.com.moloko.javacore.chapter18.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author Jack Milk
 */
public class IteratorDemo {
    public static void main(String[] args) {
        // Создать списочный массив
        ArrayList<String> al = new ArrayList<>();

        // Ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Использовать итераторы для вывода содержимого
        // списочного массива al
        System.out.println("Исходное содержимое списочного массива al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Видоизменить перебираемые объекты
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            String el = litr.next();
            litr.set(el+ "+");
        }

        System.out.println("Измененное содержимое списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Отобразить список в обратном порядке
        System.out.println("Измененный в обратном порядке список al: ");
        while (litr.hasPrevious()){
            System.out.print(litr.previous() + " ");
        }
        System.out.println();
    }
}
