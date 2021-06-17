package main.java.com.moloko.javacore.module1_3.exceptions;

/**
 * @author Jack Milk
 */
public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception");
            /*
            *   Этот оператор catch вообще не будет достигнут, т.к.
            *   подклас ArithmeticException является производным
            *   от класса Exception
             */
        } //catch (ArithmeticException e){ // ОШИБКА: Не достижимый код!
           // System.out.println("Этот код вообже не достижим");
        //}
    }
}
