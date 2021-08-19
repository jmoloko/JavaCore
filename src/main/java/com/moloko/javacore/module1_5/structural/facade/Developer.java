package main.java.com.moloko.javacore.module1_5.structural.facade;

/**
 * @author Jack Milk
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habrahabr...");
        }
    }
}
