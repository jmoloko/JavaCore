package main.java.com.moloko.javacore.module1_3.lambda;

/**
 * @author Jack Milk
 */

// Реализовать простую фабрику классов, используя ссылку на конструктор

interface TestFunc<R, T> {
    R func(T n);
}

// Простой обобщенный класс
class EasyClass<T> {
    private T val;

    // Конструктор с одним аргументом
    public EasyClass(T val) {
        this.val = val;
    }

    public EasyClass() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}

// Простой необобщенный класс
class EasyClass2 {
    String str;

    // Конструктор с одним аргументом
    public EasyClass2(String str) {
        this.str = str;
    }

    public EasyClass2() {
        this.str = "";
    }

    public String getStr() {
        return str;
    }
}

public class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор,
    // принимающий один параметр типа T. А параметр R
    // означает тип создаваемого объекта

    static <R, T> R myClassFactory(TestFunc<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор класса EasyClass
        TestFunc<EasyClass<Double>, Double> easyClassCons = EasyClass<Double>::new;

        // создать экземпляр типа класса EasyClass, используя фабричный метод
        EasyClass<Double> ec = myClassFactory(easyClassCons, 100.1);

        System.out.println("Значение val в объекте ec кдасса EasyClass: " + ec.getVal());

        // создать экземпляр типа класса EasyClass2, используя фабричный метод
        TestFunc<EasyClass2, String> easyClassCons2 = EasyClass2::new;
        EasyClass2 ec2 = myClassFactory(easyClassCons2, "Lambda");

        System.out.println("Значение str в объекте ec2 кдасса EasyClass2: " + ec2.str);
    }

}
