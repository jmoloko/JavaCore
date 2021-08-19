package main.java.com.moloko.javacore.module1_5.behavioral.mediator;

import main.java.com.moloko.javacore.module1_5.behavioral.mediator.chat.SimpleTextChat;
import main.java.com.moloko.javacore.module1_5.behavioral.mediator.user.Admin;
import main.java.com.moloko.javacore.module1_5.behavioral.mediator.user.SimpleUser;
import main.java.com.moloko.javacore.module1_5.behavioral.mediator.user.User;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "John Doe");
        User user2 = new SimpleUser(chat, "Mike Noube");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

//        user1.sendMessage("Hello I am user1 !!!");
        admin.sendMessage("Hello I am Admin !!!");
    }
}
