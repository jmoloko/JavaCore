package main.java.com.moloko.javacore.module1_5.behavioral.chain;

/**
 * @author Jack Milk
 */
public class SMSNotifier extends Notifier{

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
