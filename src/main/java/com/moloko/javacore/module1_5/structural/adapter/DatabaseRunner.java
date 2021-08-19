package main.java.com.moloko.javacore.module1_5.structural.adapter;

/**
 * @author Jack Milk
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();

    }
}
