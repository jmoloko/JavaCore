package main.java.com.moloko.javacore.module1_5.creational.abstractfactory.website;

import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Developer;
import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Manager;
import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.ProjectTeamFactory;
import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.Tester;

/**
 * @author Jack Milk
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new RubyDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getProjectManager() {
        return new WebsitePM();
    }
}
