package main.java.com.moloko.javacore.module1_5.behavioral.mediator2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack Milk
 */
public class ChatMediator implements Mediator{
    private List<User> users;

    public ChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User currentUser, String message) {
        for (User user: this.users){
            if (user != currentUser) {
                user.receive(message);
            }
        }
    }
}
