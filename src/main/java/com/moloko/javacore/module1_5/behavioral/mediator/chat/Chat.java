package main.java.com.moloko.javacore.module1_5.behavioral.mediator.chat;

import main.java.com.moloko.javacore.module1_5.behavioral.mediator.user.User;

/**
 * @author Jack Milk
 */
public interface Chat {
    public void sendMessage(String message, User user);
}
