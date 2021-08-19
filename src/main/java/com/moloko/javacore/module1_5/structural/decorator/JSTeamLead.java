package main.java.com.moloko.javacore.module1_5.structural.decorator;

/**
 * @author Jack Milk
 */
public class JSTeamLead extends DeveloperDecorator{

    public JSTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return " Send week report to customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
