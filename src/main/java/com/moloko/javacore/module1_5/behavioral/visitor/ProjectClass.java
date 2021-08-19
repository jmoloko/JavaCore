package main.java.com.moloko.javacore.module1_5.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class ProjectClass implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
