package main.java.com.moloko.javacore.chapter18.HomeWork;

import java.util.*;

/**
 * @author Jack Milk
 */
public class IntersectionLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        addValToList(list1, 25);
        addValToList(list2, 25);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(intersectionLists(list1, list2));

    }

    public static Set<Integer> intersectionLists(List<Integer> l1,  List<Integer> l2){
        Set<Integer> hs1 = new HashSet<>(l1);
        Set<Integer> hs2 = new HashSet<>(l2);
        hs1.retainAll(hs2);
        return hs1;
    }

    public static void addValToList(List<Integer> l, int limit){
        Random random = new Random();
        for (int i = 0; i < limit; i++) {
            l.add(random.nextInt(101));
        }
    }


}
