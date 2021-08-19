package main.java.com.moloko.javacore.module1_5.structural.decorator;

/**
 * @author Jack Milk
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JSTeamLead(new SeniorJSDeveloper(new JSDeveloper()));

        System.out.println(developer.makeJob());
    }
}
