package main.java.com.moloko.javacore.module1_3.inputoutput13;

import java.io.PrintWriter;

/**
 * @author Jack Milk
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Это строка");
        int i = -7;
        pw.println(i);
        double d = 4.6;
        pw.println(d);
    }
}
