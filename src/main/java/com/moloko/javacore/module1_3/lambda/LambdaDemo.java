package main.java.com.moloko.javacore.module1_3.lambda;

/**
 * @author Jack Milk
 */
interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;

        myNumber = () -> 123.4;
        System.out.println("Фиксированое значение: " + myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNumber.getValue());

    }
}
