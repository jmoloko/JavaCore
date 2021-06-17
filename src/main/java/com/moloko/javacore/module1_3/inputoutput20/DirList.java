package main.java.com.moloko.javacore.module1_3.inputoutput20;

import java.io.File;

/**
 * @author Jack Milk
 */
public class DirList {
    public static void main(String[] args) {
        String dirName = "/home/milk/Code/JAVA/Suleymanov/Schooling/JavaCore/javaIO";
        File f1 = new File(dirName);
        if (f1.isDirectory()) {
            System.out.println("Каталог: " + dirName);
            String[] s = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName + "/" + s[i]);
                if (f.isDirectory())
                    System.out.println(s[i] + " является каталогом");
                else
                    System.out.println(s[i] + " является файлом");
            }
        } else {
            System.out.println(dirName + " не является каталогом");
        }
    }
}
