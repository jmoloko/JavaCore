package main.java.com.moloko.javacore.module1_5.creational.abstractfactory.banking;

import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Developer;
import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Manager;
import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.ProjectTeamFactory;
import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Tester;

/**
 * @author Jack Milk
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getProjectManager() {
        return new BankingPM();
    }
}
