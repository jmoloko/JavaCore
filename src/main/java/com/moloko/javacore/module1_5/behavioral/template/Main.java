package main.java.com.moloko.javacore.module1_5.behavioral.template;

/**
 * @author Jack Milk
 */
public class Main {
    public static void main(String[] args) {
        WebsiteTemplate welcome = new WelcomePage();
        WebsiteTemplate news = new NewsPage();

        welcome.showPage();
        news.showPage();
    }
}
