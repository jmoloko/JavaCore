package main.java.com.moloko.javacore.module1_3.inputoutput20;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jack Milk
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        int c;
        try (FileReader fr = new FileReader("/home/milk/Code/JAVA/Suleymanov/Schooling/JavaCore/src/main/java/com/moloko/javacore/module1_3/inputoutput20/FileReaderDemo.java")){
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
