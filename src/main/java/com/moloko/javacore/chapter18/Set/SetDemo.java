package main.java.com.moloko.javacore.chapter18.Set;

import java.util.*;

/**
 * @author Jack Milk
 */
public class SetDemo {
    public static void main(String[] args) {
        // Создать хэш-множество
        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // Создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>();

        // Ввести элементы в множество
        addToSet(hs);
        addToSet(lhs);
        addToSet(ts);

        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
        System.out.println(ts.subSet("Бета", ts.last()+1));

    }

    public static void addToSet(Set<String> s){
        String[] val = {"Бета", "Альфа", "Эта", "Гамма", "Эпсилон", "Омега", "Альфа"};
        s.addAll(Arrays.asList(val));
    }

}
