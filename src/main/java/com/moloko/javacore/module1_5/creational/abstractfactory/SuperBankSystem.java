package main.java.com.moloko.javacore.module1_5.creational.abstractfactory;


import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.banking.BankingTeamFactory;

/**
 * @author Jack Milk
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
