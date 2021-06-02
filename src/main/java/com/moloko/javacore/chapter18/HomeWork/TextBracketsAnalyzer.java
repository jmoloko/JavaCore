package main.java.com.moloko.javacore.chapter18.HomeWork;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Jack Milk
 */
public class TextBracketsAnalyzer {
    public static void main(String[] args) {
        StringParser sp = new StringParser();
        String str = "([some text]{id})asd";
        System.out.println(sp.checkBrackets(str));
    }
}
class StringParser{
    static HashMap<Character,Character> brackets = new HashMap<>();

    static {
        brackets.put(')', '(');
        brackets.put('}','{');
        brackets.put(']','[');
    }

    String checkBrackets(String s){

        Stack<Character> stack = new Stack<>();
        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if(brackets.containsValue(temp)){
                stack.push(temp);
            } else if (!brackets.containsKey(temp)){
                continue;
            } else {
                if(stack.isEmpty() || stack.peek() != brackets.get(temp)) return s + " -> не корректно";
                stack.pop();
            }
        }
        if (stack.isEmpty()) return s + " -> корректно";
        else return s + " -> не корректно";
    }
}
