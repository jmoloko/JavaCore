package main.java.com.moloko.javacore.module1_3.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Jack Milk
 */
class NamePhoneEmail {
    String name;
    String phone;
    String email;

    public NamePhoneEmail(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

class NamePhone {
    String name;
    String phone;

    public NamePhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class StreamMapDemo2 {
    public static void main(String[] args) {
        List<NamePhoneEmail> list = new ArrayList<>();
        List<NamePhone> list2 = new ArrayList<>();

        list.add(new NamePhoneEmail("John", "555-555", "john@mail.ru"));
        list.add(new NamePhoneEmail("Dik", "123-456", "dik@yahoo.com"));
        list.add(new NamePhoneEmail("Mike", "890-321", "mike@gmail.com"));

        System.out.println("Исходные элементы из списка: ");
        list.stream().forEach(a -> System.out.println(a.name + " " + a.phone + " " +a.email));
        System.out.println();

        Stream<NamePhone> namePhoneStream = list.stream().map(a -> new NamePhone(a.name, a.phone));
        System.out.println("Список имен и телефонов: ");
        namePhoneStream.forEach(a -> System.out.println(a.name + " " + a.phone));
        System.out.println();

        System.out.println("Stream save to List: ");
        list2 = list.stream().map(a -> new NamePhone(a.name, a.phone)).collect(Collectors.toList());
        list2.forEach(a -> System.out.println(a.name + " " + a.phone));
        System.out.println();

        System.out.println("Stream save to LinkedList: ");
        namePhoneStream = list.stream().map(a -> new NamePhone(a.name, a.phone));
        LinkedList<NamePhone> namePhone = namePhoneStream.collect(() -> new LinkedList<>(),
                (l, element) -> l.add(element),
                (listA, listB) -> listA.addAll(listB));
        namePhone.forEach(a -> System.out.println(a.name + ": " + a.phone));
        System.out.println();

        System.out.println("Stream save to HashSet: ");
        namePhoneStream = list.stream().map(a -> new NamePhone(a.name, a.phone));
        HashSet<NamePhone> namePhoneHashSet = namePhoneStream.collect(HashSet::new, HashSet::add, HashSet::addAll);
        namePhoneHashSet.forEach(a -> System.out.println(a.name + ": " + a.phone));
    }
}
