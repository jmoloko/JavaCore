package main.java.com.moloko.javacore.module1_5.behavioral.mediator2;

/**
 * @author Jack Milk
 */
public class ChatParticipant extends User{


    public ChatParticipant(Mediator mediator, String nickname) {
        super(mediator, nickname);
    }

    @Override
    public void send(String message) {
        System.out.printf("%s write message: %s %n", this.nickname, message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.printf("%s receive message: %s %n", this.nickname, message);
    }
}
