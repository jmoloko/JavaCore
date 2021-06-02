package main.java.com.moloko.javacore.chapter18.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Jack Milk
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // Создать хэш-отображение
        HashMap<String, Double> hm = new HashMap<>();

        // Ввести элементы в хэш-отображение
        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Jane Baker", 1378.00);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralf Smith", -19.08);

        // Получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // Вывести множество записей
        for (Map.Entry<String, Double> me: set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Внести сумму 1000 на счет John Doe
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("Новый остаток на счете у John Doe: " + hm.get("John Doe"));
    }
}
