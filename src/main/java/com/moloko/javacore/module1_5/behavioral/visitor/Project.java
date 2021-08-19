package main.java.com.moloko.javacore.module1_5.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class Project implements ProjectElement{
    ProjectElement[] projectElements;

    public Project() {
        projectElements = new ProjectElement[] {
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element: projectElements) {
            element.beWritten(developer);
        }
    }
}
