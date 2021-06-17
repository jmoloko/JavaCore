package main.java.com.moloko.javacore.module1_3.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Jack Milk
 */
public class MappedChannelWrite {
    public static void main(String[] args) {
        // получить канал к файлу
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("testNIO2.txt"),
                                                    StandardOpenOption.WRITE,
                                                    StandardOpenOption.READ,
                                                    StandardOpenOption.CREATE))
        {

            // сопоставить файл сбуфером
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            // записать заданное кол-во байтв буфер
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
