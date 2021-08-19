package main.java.com.moloko.javacore.module1_5.creational.abstractfactory.website;

import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Manager;

/**
 * @author Jack Milk
 */
public class WebsitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
