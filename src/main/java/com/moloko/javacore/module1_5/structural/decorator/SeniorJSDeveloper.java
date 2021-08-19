package main.java.com.moloko.javacore.module1_5.structural.decorator;

/**
 * @author Jack Milk
 */
public class SeniorJSDeveloper extends DeveloperDecorator{

    public SeniorJSDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return " Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
