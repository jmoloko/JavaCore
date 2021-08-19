package main.java.com.moloko.javacore.module1_5.structural.proxy;

/**
 * @author Jack Milk
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("GitHub");
        project.run();
    }
}
