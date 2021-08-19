package main.java.com.moloko.javacore.module1_5.behavioral.observer;

import java.util.List;

/**
 * @author Jack Milk
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
