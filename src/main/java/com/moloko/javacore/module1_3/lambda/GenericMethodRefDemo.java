package main.java.com.moloko.javacore.module1_3.lambda;

/**
 * @author Jack Milk
 */

interface MyFun<T> {
    int fun(T[] val, T v);
}

class MyArrayOps {
    static <T> int countMatching(T[] val, T v){
        int count = 0;
        for (int i = 0; i < val.length; i++) {
            if (val[i] == v) count++;
        }
        return count;
    }
}

public class GenericMethodRefDemo {

    static <T> int myOp(MyFun<T> f, T[] val, T v){
        return f.fun(val, v);
    }

    public static void main(String[] args) {
        Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
        String[] strs = { "One", "Two", "Three", "Two" };
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа 4");

        count = myOp(MyArrayOps::countMatching, strs, "Two");
        System.out.println("Массив strs содержит " + count + " cтрок Two");
     }

}
