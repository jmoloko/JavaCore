package main.java.com.moloko.javacore.module1_3.lambda;

import java.util.function.Function;

/**
 * @author Jack Milk
 */
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {

        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };

        System.out.println("Факториал числа 3 равен: " + factorial.apply(3));
        System.out.println("Факториал числа 5 равен: " + factorial.apply(5));

    }
}
