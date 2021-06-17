package main.java.com.moloko.javacore.module1_3.lambda;

/**
 * @author Jack Milk
 */
interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1 ; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбда обращается на: " + reverse.func("Лямбда"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println("Факториал числа 5 равен: " + factorial.func(5));
    }
}
