package main.java.com.moloko.javacore.module1_3.exceptions;

/**
 * @author Jack Milk
 */
public class FinallyDemo {
    // Сгенерировать исключение м методе
    static void procA(){
        try {
            System.out.println("В теле метода procA");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA");
        }
    }

    // Возвратить управление из блока оператора try
    static void procB() {
        try {
            System.out.println("В теле метода procB");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB");
        }
    }

    // Выполнить блок try как обычно
    static void procC() {
        try {
            System.out.println("В теле метода procC");
        } finally {
            System.out.println("Блок оператора finally в методе procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение из метода procA перехвачено");
        }


        procB();
        procC();
    }
}
