package main.java.com.moloko.javacore.module1_5.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jack Milk
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "ruby":
                    System.out.println("Hiring Ruby developer...");
                    developer = new RubyDeveloper();
                    break;
                case "python":
                    System.out.println("Hiring Python developer...");
                    developer = new PythonDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
