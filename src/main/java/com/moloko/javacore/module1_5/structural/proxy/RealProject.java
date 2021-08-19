package main.java.com.moloko.javacore.module1_5.structural.proxy;

/**
 * @author Jack Milk
 */
public class RealProject implements Project{
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Loading project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
