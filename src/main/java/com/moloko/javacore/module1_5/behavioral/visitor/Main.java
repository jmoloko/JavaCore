package main.java.com.moloko.javacore.module1_5.behavioral.visitor;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action");
        project.beWritten(junior);

        System.out.println("Senior in action");
        project.beWritten(senior);
    }
}
