package main.java.com.moloko.javacore.module1_3.nio;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * @author Jack Milk
 */
public class NIOStreamWrite {
    public static void main(String[] args) {

        // открыть файл и получить поток вывода
        try (OutputStream stream = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))){

            // вывести в поток заданное количество байтов
            for (int i = 0; i < 26; i++) {
                stream.write((byte) ('A' + i));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

    }
}
