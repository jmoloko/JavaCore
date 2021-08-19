package main.java.com.moloko.javacore.module1_5.structural.facade;

/**
 * @author Jack Milk
 */
public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active!");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
