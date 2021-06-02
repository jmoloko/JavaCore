package main.java.com.moloko.javacore.chapter18.LinkedList;

import java.util.LinkedList;

/**
 * @author Jack Milk
 */
class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" +
                city + " " + state + " " + code;
    }
}

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();

        // Ввести элементы в связный список
        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralf Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm Str", "Champaing", "IL", "61820"));

        // Вывести список почтовых адресов
        for (Address addr: ml)
            System.out.println(addr + "\n");
        System.out.println();
    }
}
