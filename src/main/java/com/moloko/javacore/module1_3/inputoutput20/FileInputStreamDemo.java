package main.java.com.moloko.javacore.module1_3.inputoutput20;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Jack Milk
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {

        int size;
        String path = "/home/milk/Code/JAVA/Suleymanov/Schooling/JavaCore/src/main/java/com/moloko/javacore/module1_3/inputoutput20/FileInputStreamDemo.java";
        try (FileInputStream f = new FileInputStream(path)){

            System.out.println("Общее клоличество доступных байтов: " + (size = f.available()));

            int n = size;
            System.out.println("Первые " + n + " байтов, " + "прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("\nВсе еще доступно: " + f.available());

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
