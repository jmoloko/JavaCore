package main.java.com.moloko.javacore.module1_3.nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * @author Jack Milk
 */
public class MappedChannelRead {
    public static void main(String[] args) {
        // получить канал к файлу
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))){

            // получить размер файла
            long fSize = fChan.size();

            // сопоставить файл с буфером
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            // читать байты из буфера и выводить на экран
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }
            System.out.println();

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
