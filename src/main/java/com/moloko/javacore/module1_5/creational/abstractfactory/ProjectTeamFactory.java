package main.java.com.moloko.javacore.module1_5.creational.abstractfactory;

/**
 * @author Jack Milk
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getProjectManager();
}
