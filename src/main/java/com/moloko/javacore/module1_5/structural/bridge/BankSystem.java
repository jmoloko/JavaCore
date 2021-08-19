package main.java.com.moloko.javacore.module1_5.structural.bridge;

/**
 * @author Jack Milk
 */
public class BankSystem extends Program{

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writeCode();
    }
}
