package main.java.com.moloko.javacore.module1_3.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * @author Jack Milk
 */
public class URLConnectionDemo {
    public static void main(String[] args) throws IOException {
        int c;

        URL url = new URL("http://internic.net");
        URLConnection connection = url.openConnection();

        // получить дату
        long d = connection.getDate();
        if (d == 0) System.out.println("Сведения о дате отсутствуют");
        else System.out.println("Дата: " + new Date(d));

        // получить тип содержимого
        System.out.println("Тип содержимого: " + connection.getContentType());

        // получить дату срока действия ресурса
        d = connection.getExpiration();
        if (d == 0) System.out.println("Сведения о сроке действия ресурса отсутствкет");
        else System.out.println("Срок действия истекает: " + new Date(d));

        // дата последней модификации
        d = connection.getLastModified();
        if (d == 0) System.out.println("Дата последней модификации не известна");
        else System.out.println("Дата последней модификации: " + new Date(d));

        // получить длинну содержимого
        long len = connection.getContentLengthLong();
        if (len == -1) System.out.println("Длинна содержимого не доступна");
        else System.out.println("Длинна содержимого: " + len);

        if (len != 0) {
            System.out.println("============Содержимое=========");
            InputStream input = connection.getInputStream();
            while ((c = input.read()) != -1) {
                System.out.print((char) c);
            }
            input.close();
        } else {
            System.out.println("Содержимое недоступно");
        }
    }
}
