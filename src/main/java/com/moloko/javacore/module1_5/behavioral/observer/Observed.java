package main.java.com.moloko.javacore.module1_5.behavioral.observer;

/**
 * @author Jack Milk
 */
public interface Observed {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
