package main.java.com.moloko.javacore.module1_5.creational.abstractfactory.banking;

import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Developer;

/**
 * @author Jack Milk
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code....");
    }
}
