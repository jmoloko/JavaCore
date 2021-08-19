package main.java.com.moloko.javacore.module1_5.behavioral.chain;

/**
 * @author Jack Milk
 */

public class EmailNotifier extends Notifier{

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
