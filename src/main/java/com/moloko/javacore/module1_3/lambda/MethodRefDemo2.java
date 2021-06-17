package main.java.com.moloko.javacore.module1_3.lambda;

/**
 * @author Jack Milk
 */

interface StrFunc {
    String func(String str);
}

class MyStrOps {
     String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1 ; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class MethodRefDemo2 {
    static String stringOp(StrFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStrOps myStrOps = new MyStrOps();

        outStr = stringOp(myStrOps::strReverse, inStr);
        System.out.println(outStr);
    }
}
