package main.java.com.moloko.javacore.module1_5.behavioral.strategy;

/**
 * @author Jack Milk
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.doIt();
    }
}
