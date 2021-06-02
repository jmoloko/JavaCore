package main.java.com.moloko.javacore.chapter18.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Jack Milk
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        // Создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>();

        // Ввести элементы в древовидное отображение
        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralf Smith", -19.08);

        // Пролучить множество записей
        Set<Map.Entry<String, Double>> st = tm.entrySet();

        // Вывести множество записей
        for (Map.Entry<String, Double> m: st){
            System.out.print(m.getKey() + ": ");
            System.out.println(m.getValue());
        }
        System.out.println();

        // Внести сумму 1000 на счет John Doe
        double bl = tm.get("John Doe");
        tm.put("John Doe", bl + 1000);
        System.out.println("Новый остаток на счете у John Doe: " + tm.get("John Doe"));
    }

}
