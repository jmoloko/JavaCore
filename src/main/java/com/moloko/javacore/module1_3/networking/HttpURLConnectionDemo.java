package main.java.com.moloko.javacore.module1_3.networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Jack Milk
 */
public class HttpURLConnectionDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // вывести метод запроса
        System.out.println("Метод запроса: " + connection.getRequestMethod());

        // вывести код ответа
        System.out.println("Код ответа: " + connection.getResponseCode());

        // вывести ответное сообщение
        System.out.println("Ответное сообщение: " + connection.getResponseMessage());

        // получить список полей из заголовка
        Map<String, List<String>> map = connection.getHeaderFields();
        Set<String> field = map.keySet();
        System.out.println("/n далее следует заголовок: ");

        // вывести все ключи и значения из заголовка
        for (String k: field) {
            System.out.println("Ключ: " + k + " | Значение: " + map.get(k));
        }
    }
}
