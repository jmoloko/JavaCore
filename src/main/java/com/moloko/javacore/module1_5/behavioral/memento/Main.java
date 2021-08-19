package main.java.com.moloko.javacore.module1_5.behavioral.memento;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo repo = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to Github...");
        repo.setSave(project.save());

        System.out.println("Updating project to Version 1.1");
        System.out.println("Writing poor code...");
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Rolling back to Version 1.0");
        project.load(repo.getSave());
        System.out.println(project);

    }
}
