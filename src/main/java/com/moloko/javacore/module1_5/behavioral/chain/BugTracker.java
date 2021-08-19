package main.java.com.moloko.javacore.module1_5.behavioral.chain;

/**
 * @author Jack Milk
 */
public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything id OK.", Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong.", Priority.IMPORTANT);
        reportNotifier.notifyManager("We had a problem!.", Priority.ASAP);
    }
}
