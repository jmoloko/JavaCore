package main.java.com.moloko.javacore.module1_5.behavioral.mediator2;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        User admin = new ChatParticipant(mediator, "Admin");
        User user1 = new ChatParticipant(mediator, "Simple user1");
        User user2 = new ChatParticipant(mediator, "Simple user2");

        mediator.addUser(admin);
        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Hi");
        user2.send("Hello");
        admin.send("Fouck!");
    }
}
