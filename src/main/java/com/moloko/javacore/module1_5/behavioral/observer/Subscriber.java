package main.java.com.moloko.javacore.module1_5.behavioral.observer;

import java.util.List;

/**
 * @author Jack Milk
 */
public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "! We have some changes in vacancies.\n" + vacancies +
                "\n==========================================");
    }
}
