package main.java.com.moloko.javacore.module1_3.networking;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author Jack Milk
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);

        InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
        System.out.println(Arrays.toString(sw));
    }
}
