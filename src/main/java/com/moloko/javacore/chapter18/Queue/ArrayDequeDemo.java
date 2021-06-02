package main.java.com.moloko.javacore.chapter18.Queue;

import java.util.ArrayDeque;

/**
 * @author Jack Milk
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<>();

        // использовать класс ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Извлечение из стека: ");
        while (adq.peek() != null){
            System.out.print(adq.pop() + " ");
            System.out.println();
        }
    }
}
