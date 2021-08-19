package main.java.com.moloko.javacore.module1_5.behavioral.mediator.chat;

import main.java.com.moloko.javacore.module1_5.behavioral.mediator.user.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack Milk
 */
public class SimpleTextChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u: users){
            if (u != user){
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
