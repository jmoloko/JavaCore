package main.java.com.moloko.javacore.module1_3.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Jack Milk
 */
public class ExplicitChannelWrite {
    public static void main(String[] args) {
        // получить канал к файлу
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("testNIO.txt"),
                                                StandardOpenOption.WRITE,
                                                StandardOpenOption.CREATE))
        {

            // создать буфер
            ByteBuffer mBuf = ByteBuffer.allocate(26);

            // записать некоторое кол-во байт в буфер
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }

            // подготовить буфер
            mBuf.rewind();

            // записать данные из буфера в файл
            fChan.write(mBuf);

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
