package main.java.com.moloko.javacore.module1_5.structural.bridge;

/**
 * @author Jack Milk
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
