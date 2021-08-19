package main.java.com.moloko.javacore.module1_5.creational.abstractfactory.website;

import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Developer;

/**
 * @author Jack Milk
 */
public class RubyDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Ruby developer writes ROR code...");
    }
}
