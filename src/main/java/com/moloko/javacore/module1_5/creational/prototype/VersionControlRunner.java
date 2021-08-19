package main.java.com.moloko.javacore.module1_5.creational.prototype;

/**
 * @author Jack Milk
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode();");

        System.out.println(master);

        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterCopy = factory.cloneProject();
        System.out.println(masterCopy);
    }
}
