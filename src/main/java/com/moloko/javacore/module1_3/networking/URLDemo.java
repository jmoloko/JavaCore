package main.java.com.moloko.javacore.module1_3.networking;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Jack Milk
 */
public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.HerbSchildt.com/Articles");

        System.out.println("Протокол: " + url.getProtocol());
        System.out.println("Порт: " + url.getPort());
        System.out.println("Хост: " + url.getHost());
        System.out.println("Файл: " + url.getFile());
        System.out.println("Полная форма: " + url.toExternalForm());
    }
}
