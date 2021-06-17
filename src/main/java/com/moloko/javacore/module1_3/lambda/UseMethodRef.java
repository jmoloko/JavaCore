package main.java.com.moloko.javacore.module1_3.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jack Milk
 */

class MyClass {
    private int val;

    public MyClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b){
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        List<MyClass> al = new ArrayList<>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));

        MyClass maxObj = Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Максимальное значение равно: " + maxObj.getVal());
    }
}
