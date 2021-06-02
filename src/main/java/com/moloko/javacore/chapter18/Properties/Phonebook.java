package main.java.com.moloko.javacore.chapter18.Properties;

import java.io.*;
import java.util.Locale;
import java.util.Properties;

/**
 * @author Jack Milk
 */
public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        // Попытаться открыть файл phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e){
            // игнорировать отсутствующий файл
        }

        /*
        *  Если телефонная книга уже существует,
        *  загрузить существующие тел номера
        * */
        try {
            if (fin != null){
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }

        // Разрешить пользователю воодить новые имена
        // и номера телефонов
        do {
            System.out.println("Введите имя" + " ('выход' для завершения): ");
            name = br.readLine();
            if (name.toLowerCase().equals("выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.toLowerCase().equals("выход"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "телефонная книга");
            fout.close();
        }

        // искать номер по имени абонента
        do {
            System.out.println("Введите имя для поиска" + " ('выход' для завершения): ");
            name = br.readLine();
            if (name.toLowerCase().equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.toLowerCase().equals("выход"));

    }
}
