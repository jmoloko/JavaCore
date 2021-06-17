package main.java.com.moloko.javacore.module1_3.lambda;

/**
 * @author Jack Milk
 */

interface MyConsFun {
    MyDemoClass fun(int n);
}

class MyDemoClass {
    private int val;

    public MyDemoClass(int val) {
        this.val = val;
    }

    public MyDemoClass() {
        val = 0;
    }

    public int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {

        MyConsFun myDemoClassCons = MyDemoClass::new;

        MyDemoClass mdc = myDemoClassCons.fun(100);

        System.out.println("Значение val в объекте класса MyDemoClass: " + mdc.getVal());

    }
}
