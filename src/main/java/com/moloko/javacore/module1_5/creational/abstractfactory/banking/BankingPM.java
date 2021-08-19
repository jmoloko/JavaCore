package main.java.com.moloko.javacore.module1_5.creational.abstractfactory.banking;

import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Manager;

/**
 * @author Jack Milk
 */
public class BankingPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
