package main.java.com.moloko.javacore.module1_5.structural.adapter;

/**
 * @author Jack Milk
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database{

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
