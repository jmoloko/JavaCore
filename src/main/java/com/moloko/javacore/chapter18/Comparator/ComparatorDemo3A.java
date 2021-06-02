package main.java.com.moloko.javacore.chapter18.Comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Jack Milk
 */
// comparator сравнивающий фамилии вкладчиков
class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int i, j;
        // Найти индекс символа с которого начинается фамилия
        i = a.lastIndexOf(" ");
        j = b.lastIndexOf(" ");
        return a.substring(i).compareToIgnoreCase(b.substring(j));
    }
}

// comparator сравнивающий ФИО вкладчиков
class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}

public class ComparatorDemo3A {
    public static void main(String[] args) {
        // использовать метод thenComparing()
        CompLastNames cln = new CompLastNames();
        Comparator<String> comLastThenFirst = cln.thenComparing(new CompThenByFirstName());

        // Создать древовидное отображение
        TreeMap<String, Double> tmc = new TreeMap<>(comLastThenFirst);

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
