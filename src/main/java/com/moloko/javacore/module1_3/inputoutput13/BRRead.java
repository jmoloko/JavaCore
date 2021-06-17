package main.java.com.moloko.javacore.module1_3.inputoutput13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jack Milk
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
