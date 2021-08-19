package main.java.com.moloko.javacore.module1_5.behavioral.visitor;

/**
 * @author Jack Milk
 */
public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
