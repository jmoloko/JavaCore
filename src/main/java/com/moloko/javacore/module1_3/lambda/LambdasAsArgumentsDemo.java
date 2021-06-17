package main.java.com.moloko.javacore.module1_3.lambda;

import java.util.Locale;

/**
 * @author Jack Milk
 */
interface StringFunc {
    String func(String str);
}
public class LambdasAsArgumentsDemo {
    static String stringOp(StringFunc sf, String str){
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Исходная строка: " + inStr);

        outStr = stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Строка в вверхнем регистре: " + outStr);

        outStr = stringOp(str -> {
            String res = "";
            int i;
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    res += str.charAt(i);
            }
            return res;
        }, inStr);
        System.out.println("Строка без пробелов: " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1 ; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        outStr = stringOp(reverse, inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
