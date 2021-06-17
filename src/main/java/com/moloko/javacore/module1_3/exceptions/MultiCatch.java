package main.java.com.moloko.javacore.module1_3.exceptions;

/**
 * @author Jack Milk
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = { 1, 2, 3 };

        try {
            int result = a / b;
            vals[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата");

    }
}
