package main.java.com.moloko.javacore.module1_3.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Jack Milk
 */
public class Whois {
    public static void main(String[] args) throws IOException {
        int c;

        // создать сокетное соединение с internic.net порт 43
        Socket s = new Socket("whois.internic.net", 43);

        // получить потоки ввода-вывода
        InputStream is = s.getInputStream();
        OutputStream os = s.getOutputStream();

        // Сформировать строку запроса
        String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

        // преобразовать строку в байты
        byte[] buf = str.getBytes();

        // послать запрос
        os.write(buf);

        // прочитать ответ и вывести на экран
        while ((c = is.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
