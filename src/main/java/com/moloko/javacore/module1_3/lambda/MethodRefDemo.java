package main.java.com.moloko.javacore.module1_3.lambda;

/**
 * @author Jack Milk
 */

interface StringFun {
    String func(String str);
}

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1 ; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class MethodRefDemo {
    static String strReversTest(String str){
        String result = "";
        for (int i = str.length() - 1 ; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    static String stringOp(StringFun sf, String str){
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

//        outStr = stringOp(MethodRefDemo::strReversTest, inStr);
//        outStr = stringOp(str -> MyStringOps.strReverse(str), inStr);
        outStr = stringOp(MyStringOps::strReverse, inStr);
        System.out.println(outStr);
    }
}
