package main.java.com.moloko.javacore.module1_3.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * @author Jack Milk
 */
public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;

        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test.txt"))){

            // выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {

                // читать данные из файла в буфер
                count = fChan.read(mBuf);

                // прекратить чтение по достижении конца файла
                if (count != -1) {
                    // подготовить буфер к чтению из него
                    mBuf.rewind();

                    // читать байты данных из буфера и
                    // выводить на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
