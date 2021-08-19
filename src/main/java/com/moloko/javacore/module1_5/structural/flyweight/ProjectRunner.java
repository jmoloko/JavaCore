package main.java.com.moloko.javacore.module1_5.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack Milk
 */
public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("ruby"));
        developers.add(developerFactory.getDeveloperBySpeciality("ruby"));
        developers.add(developerFactory.getDeveloperBySpeciality("ruby"));
        developers.add(developerFactory.getDeveloperBySpeciality("python"));
        developers.add(developerFactory.getDeveloperBySpeciality("python"));
        developers.add(developerFactory.getDeveloperBySpeciality("python"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
