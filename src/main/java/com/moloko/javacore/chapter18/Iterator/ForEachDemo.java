package main.java.com.moloko.javacore.chapter18.Iterator;

import java.net.Socket;
import java.util.ArrayList;

/**
 * @author Jack Milk
 */
public class ForEachDemo {
    public static void main(String[] args) {
        // Создать списочный массив для целых чисел
        ArrayList<Integer> vals = new ArrayList<>();

        // Ввести числовые значения в списочный массив
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // Цикл для вывода числовыхзначений
        System.out.println("Исходные значения списочного масива vals: ");
        for (Integer i: vals){
            System.out.print(i + " ");
        }
        System.out.println();

        // суммировать числовые значения списочного массива в цикле for
        int sum = 0;
        for (Integer i: vals){
            sum += i;
        }
        System.out.println("Сумма числовых значений списочного массива vals: " + sum);
    }
}
