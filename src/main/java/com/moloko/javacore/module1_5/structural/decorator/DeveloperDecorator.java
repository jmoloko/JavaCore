package main.java.com.moloko.javacore.module1_5.structural.decorator;

/**
 * @author Jack Milk
 */
public class DeveloperDecorator implements Developer{

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
