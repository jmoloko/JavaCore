package main.java.com.moloko.javacore.module1_5.creational.builder;

/**
 * @author Jack Milk
 */
public class VisitCardWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Visit Card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
