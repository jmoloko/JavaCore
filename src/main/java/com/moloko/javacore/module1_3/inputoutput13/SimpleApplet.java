package main.java.com.moloko.javacore.module1_3.inputoutput13;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/

/**
 * @author Jack Milk
 */
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Простейший апплет", 20, 20);
    }
}
