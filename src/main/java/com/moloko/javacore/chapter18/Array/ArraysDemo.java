package main.java.com.moloko.javacore.chapter18.Array;


import java.util.Arrays;

/**
 * @author Jack Milk
 */
public class ArraysDemo {
    public static void main(String[] args) {
        // Выделить и инициализировать массив
            int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        // Вывести, отсортировать и снова вывести содержимое массива
        System.out.println("Исходный массив: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

        // Заполнить массив и вывести его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.println("Массив после вызова метода fill(): " + Arrays.toString(array));

        // Отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.println("Массив после повторной сортировки: " + Arrays.toString(array));

        // Выполнить двоичный поиск значения -9
        int x = Arrays.binarySearch(array, -9);
        System.out.println("Значение -9 находится на позиции: " + x);

    }
}
