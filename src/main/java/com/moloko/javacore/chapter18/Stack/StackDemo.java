package main.java.com.moloko.javacore.chapter18.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Jack Milk
 */
public class StackDemo {
    static void showPush(Stack<Integer> st, int a){
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showPop(Stack<Integer> st){
        System.out.print("pop -> ");
        int a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println("stack: " + st);
        showPush(st, 42);
        showPush(st, 86);
        showPush(st, 66);
        showPop(st);
        showPop(st);
        showPop(st);

        try {
            showPop(st);
        } catch (EmptyStackException e){
            System.out.println("Стек пуст");
        }
    }
}
