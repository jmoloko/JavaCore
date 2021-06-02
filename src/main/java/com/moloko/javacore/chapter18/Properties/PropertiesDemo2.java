package main.java.com.moloko.javacore.chapter18.Properties;

import java.util.Properties;
import java.util.Set;

/**
 * @author Jack Milk
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Флорида", "Тэлесси");
        defList.put("Висконсин", "Мэдисон");

        Properties capitals = new Properties(defList);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        // Получить множество ключей
        Set<?> states = capitals.keySet();

        // Показать все штаты и их столицы
        for (Object name: states){
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name));
        }
        System.out.println();

        // Штат Флорида будет найден в списке по умолчанию
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица штата Флорида " + str);
    }
}
