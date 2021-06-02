package main.java.com.moloko.javacore.chapter18.ArrayList;

import java.util.ArrayList;

/**
 * @author Jack Milk
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        // Создать списочный массив
        ArrayList<Integer> al = new ArrayList<>();

        // Ввести элементы в списочный массив
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Содержимое списочного массива al: " + al);

        // Получить обычный массив
        Integer[] ia = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
        // Суммировать элементы массива
        for (int i: ia) sum += i;

        System.out.println("Сумма: " + sum);
    }
}
