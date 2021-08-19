package main.java.com.moloko.javacore.module1_5.behavioral.chain;

/**
 * @author Jack Milk
 */
public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
