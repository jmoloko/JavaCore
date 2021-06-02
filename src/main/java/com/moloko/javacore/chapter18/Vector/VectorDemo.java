package main.java.com.moloko.javacore.chapter18.Vector;

import java.util.Vector;

/**
 * @author Jack Milk
 */
public class VectorDemo {
    public static void main(String[] args) {
        // Начальный размер вектора - 3, инкремент - 2
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Начальный размер вектора: " + v.size());
        System.out.println("Начальный емкость вектора: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Емкость вектора после ввода 4х элементов: " + v.capacity());

        v.addElement(5);
        System.out.println("Текущая емкость вектора: " + v.capacity());

        v.addElement(6);
        v.addElement(7);
        System.out.println("Текущая емкость вектора: " + v.capacity());

        v.addElement(9);
        v.addElement(10);
        System.out.println("Текущая емкость вектора: " + v.capacity());

        v.addElement(11);
        v.addElement(12);
        System.out.println("Первый элемент вектора: " + v.firstElement());
        System.out.println("Последний элемент вектора: " + v.lastElement());

        if (v.contains(3)) System.out.println("Вектор содержит значение 3");

        // Перечислить элементы вектора
        for (Integer el: v)
            System.out.print(el + " ");
    }
}
