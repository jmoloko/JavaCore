package main.java.com.moloko.javacore.module1_5.creational.factory;

/**
 * @author Jack Milk
 */
public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
