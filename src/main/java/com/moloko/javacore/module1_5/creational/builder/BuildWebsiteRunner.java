package main.java.com.moloko.javacore.module1_5.creational.builder;

/**
 * @author Jack Milk
 */
public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
