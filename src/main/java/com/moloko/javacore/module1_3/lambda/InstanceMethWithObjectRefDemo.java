package main.java.com.moloko.javacore.module1_3.lambda;

/**
 * @author Jack Milk
 */

interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    HighTemp(int ht){
        hTemp = ht;
    }

    boolean sameTemp(HighTemp temp){
        return hTemp == temp.hTemp;
    }

    boolean lessThenTemp(HighTemp temp){
        return hTemp < temp.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {

    static <T> int counter(T[] vals,  MyFunc<T> f, T v){
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int count;
        HighTemp[] weekDayHighs = { new HighTemp(89), new HighTemp(82), new HighTemp(90),
                                    new HighTemp(89), new HighTemp(89), new HighTemp(91),
                                    new HighTemp(84), new HighTemp(83)};

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней когда максимальная температура была 89: " + count);


    }

}
