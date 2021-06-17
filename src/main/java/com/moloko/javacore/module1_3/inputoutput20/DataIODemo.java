package main.java.com.moloko.javacore.module1_3.inputoutput20;

import java.io.*;

/**
 * @author Jack Milk
 */
public class DataIODemo {
    public static void main(String[] args) {
        // сначала вывести данные в файл
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        // вывести данные из файла
        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Получаемые значения: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
