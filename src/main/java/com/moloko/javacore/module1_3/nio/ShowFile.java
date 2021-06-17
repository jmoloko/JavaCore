package main.java.com.moloko.javacore.module1_3.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UTFDataFormatException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Jack Milk
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;

        // удостоверимся, что указано имя файла
        if (args.length != 1) {
            System.out.println("Применение: ShowFile имя_файла");
            return;
        }

        // открыть файл и получить поток ввода-вывода
        try (InputStream stream = Files.newInputStream(Paths.get(args[0]))){

            do {
                i = stream.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
