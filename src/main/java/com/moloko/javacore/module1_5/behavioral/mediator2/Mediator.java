package main.java.com.moloko.javacore.module1_5.behavioral.mediator2;

/**
 * @author Jack Milk
 */
public interface Mediator {
    void addUser(User user);
    void sendMessage(User user, String message);
}
