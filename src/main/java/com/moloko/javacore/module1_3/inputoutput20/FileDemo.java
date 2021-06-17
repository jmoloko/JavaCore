package main.java.com.moloko.javacore.module1_3.inputoutput20;

import java.io.File;

/**
 * @author Jack Milk
 */
public class FileDemo {
    static void p(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        File f1 = new File("/home/milk/Code/JAVA/Suleymanov/Schooling/JavaCore/javaIO/COPYRIGHT");
        p("Имя файла: " + f1.getName());
        p("Путь: " + f1.getPath());
        p("Абсолютный путь: " + f1.getAbsolutePath());
        p("Родительский каталог: " + f1.getParent());
        p(f1.exists() ? "существует" : "не существует");
        p(f1.canWrite() ? "доступен для записи" : "не доступен для записи");
        p(f1.canRead() ? "доступен для чтения" : "не доступен для чтения");
        p(f1.isDirectory() ? "это каталог" : "это не каталог");
        p(f1.isFile() ? "является обычным файлом" : "может быть именованым каналом");
        p(f1.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        p("Последние изменения в файле: " + f1.lastModified());
        p("Размер: " + f1.length() + " байт");
    }
}
