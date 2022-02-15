/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javaapplication1;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author Dhanur
 */
public class NewApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g) {
        g.drawString("Welcome in Java Applet.", 40, 20); // Draws the text given by the specified string
        showStatus("This is shown in the status window."); // Requests that the argument string be displayed in the
                                                           // "status window".
        /*
         * g.drawLine(30,300,200,10);
         * g.drawRect(400,50,200,100);
         * g.drawOval(100-50,100-50,100,100);
         */
        g.drawRect(300, 150, 200, 100);
        g.setColor(Color.yellow);
        g.fillRect(300, 150, 200, 100);
        g.setColor(Color.magenta);
        g.drawString("Rectangle", 500, 150);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
