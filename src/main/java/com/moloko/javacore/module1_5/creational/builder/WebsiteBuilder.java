package main.java.com.moloko.javacore.module1_5.creational.builder;

/**
 * @author Jack Milk
 */
public abstract class WebsiteBuilder {
    Website website;

    public void createWebsite(){
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    public Website getWebsite(){
        return website;
    }
}
