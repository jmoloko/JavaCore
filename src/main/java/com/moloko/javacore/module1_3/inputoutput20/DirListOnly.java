package main.java.com.moloko.javacore.module1_3.inputoutput20;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Jack Milk
 */
class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/home/milk/Code/JAVA/Suleymanov/Schooling/JavaCore/javaIO";
        File f1 = new File(dirname);

//        FilenameFilter only = new OnlyExt("html");
        String[] s = f1.list((f, name) -> name.endsWith(".html"));

        for (String str: s)
            System.out.println(str);
    }
}
