package main.java.com.moloko.javacore.module1_5.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting Class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixed database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable tests...");
    }
}
