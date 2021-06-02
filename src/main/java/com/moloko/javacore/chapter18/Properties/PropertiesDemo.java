package main.java.com.moloko.javacore.chapter18.Properties;

import java.util.Properties;
import java.util.Set;

/**
 * @author Jack Milk
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();

        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");
        capitals.put("Флорида", "Undefined");

        // Получить множество ключей
        Set<?> states = capitals.keySet();

        // Показать все штаты и их столицы
        for (Object name: states){
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name));
        }
        System.out.println();

        // Найти штат, отсутствующий в списке, указав
        // значения выбираемые по умолчанию
        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица штата Флорида " + str);
    }
}
