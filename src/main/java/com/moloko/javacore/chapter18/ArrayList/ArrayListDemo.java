package main.java.com.moloko.javacore.chapter18.ArrayList;

import java.util.ArrayList;

/**
 * @author Jack Milk
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // Создать списочный массив
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Начальный размер списочного массива al: " + al.size());

        // Ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("Размер списочного массива al после добавления элементов: " + al.size());

        // Вывести списочный массив
        System.out.println("Содержимое списочного массива al: " + al);

        // удалить элементы из списочного массива
        al.remove("F");
        al.remove(2);

        System.out.println("Размер списочного массива al после удаления элементов: " + al.size());
        System.out.println("Содержимое списочного массива al: " + al);
    }
}
