package main.java.com.moloko.javacore.chapter18.Comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Jack Milk
 */

class TComp implements Comparator<String> {
    public int compare(String a, String b){
        int i, j, k;

        // Найти индекс символа с которого начинается фамилия
        i = a.lastIndexOf(" ");
        j = b.lastIndexOf(" ");
        k = a.substring(i).compareTo(b.substring(j));
        if (k == 0) return a.compareTo(b);
        else return k;
    }
}

public class ComparatorDemo3 {
    public static void main(String[] args) {
        // Создать древовидное отображение
        TreeMap<String, Double> tmc = new TreeMap<>(new TComp());

        // Ввести элементы в древовидное отображение
        tmc.put("John Doe", 3434.34);
        tmc.put("Tom Smith", 123.22);
        tmc.put("Jane Baker", 1378.00);
        tmc.put("Tod Hall", 99.22);
        tmc.put("Ralf Smith", -19.08);

        // Пролучить множество записей
        Set<Map.Entry<String, Double>> st = tmc.entrySet();

        // Вывести множество записей
        for (Map.Entry<String, Double> m: st){
            System.out.print(m.getKey() + ": ");
            System.out.println(m.getValue());
        }
        System.out.println();

        // Внести сумму 1000 на счет John Doe
        double bl = tmc.get("John Doe");
        tmc.put("John Doe", bl + 1000);
        System.out.println("Новый остаток на счете у John Doe: " + tmc.get("John Doe"));
    }
}
