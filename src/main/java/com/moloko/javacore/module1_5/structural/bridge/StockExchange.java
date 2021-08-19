package main.java.com.moloko.javacore.module1_5.structural.bridge;

/**
 * @author Jack Milk
 */
public class StockExchange extends Program{

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
