package main.java.com.moloko.javacore.module1_5.creational.abstractfactory;

import main.java.com.moloko.javacore.module1_5.creational.abstractfactory.website.WebsiteTeamFactory;

/**
 * @author Jack Milk
 */
public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getProjectManager();

        System.out.println("Create website...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
