package main.java.com.moloko.javacore.module1_3.exceptions;

/**
 * @author Jack Milk
 */
public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int[] c = { 1 };
            c[42] = 99;
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка индексации з пределами массива: " + e);
        }
        System.out.println("После блока try/catch");
    }
}
