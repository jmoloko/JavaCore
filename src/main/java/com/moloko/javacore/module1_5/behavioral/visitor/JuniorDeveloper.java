package main.java.com.moloko.javacore.module1_5.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor Class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable tests...");
    }
}
