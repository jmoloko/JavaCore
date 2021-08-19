package main.java.com.moloko.javacore.module1_5.behavioral.template;

/**
 * @author Jack Milk
 */
public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
