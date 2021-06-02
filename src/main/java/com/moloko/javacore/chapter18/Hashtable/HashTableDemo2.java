package main.java.com.moloko.javacore.chapter18.Hashtable;

import java.util.*;

/**
 * @author Jack Milk
 */
public class HashTableDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();

        String str;
        double bal;

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralf Smith", -19.08);

        // Вывести все счета в хэш-таблице
        // Сначала получить представление всех ключей в виде множества
        Set<String> set = balance.keySet();

        // получить итератор
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        for (Map.Entry<String, Double> entry: balance.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        // Внести сумму 1000 на счет John Doe
        bal = balance.get("John Doe");
        balance.put("John Doe", bal + 1000);
        System.out.println("Новый остаток на счете у John Doe: " + balance.get("John Doe"));
     }
}
