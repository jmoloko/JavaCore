package main.java.com.moloko.javacore.module1_3.inputoutput20;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author Jack Milk
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String  tmp = "abcdefghijklmnopqrstuvwxyz";
        int len = tmp.length();
        char[] c = new char[len];

        tmp.getChars(0, len, c, 0);
        int i;

        try (CharArrayReader input1 = new CharArrayReader(c)){
            while ((i = input1.read()) != -1) System.out.print((char) i);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        try (CharArrayReader input2 = new CharArrayReader(c, 0, 5)){
            while ((i = input2.read()) != -1) System.out.print((char) i);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
