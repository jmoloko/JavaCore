package main.java.com.moloko.javacore.module1_5.structural.facade;

/**
 * @author Jack Milk
 */
public class Workflow {
    private Developer developer = new Developer();
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
