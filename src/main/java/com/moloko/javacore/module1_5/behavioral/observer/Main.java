package main.java.com.moloko.javacore.module1_5.behavioral.observer;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();
        site.addVacancy("First Java Position");
        site.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("John Doe");
        Observer secondSubscriber = new Subscriber("Mike Role");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("Third Java Position");

        site.removeVacancy("First Java Position");
    }
}
