package main.java.com.moloko.javacore.module1_5.behavioral.strategy;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();
    }
}
