/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javaapplication1;

import java.applet.*;
import java.awt.*;

public class Banner extends Applet implements Runnable {

    String str = "A message is to be displayed while it's aminated moving";
    Thread t = null;
    int state;
    boolean stopFlag;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.CYAN);
        setForeground(Color.BLUE);
    }
//Start thread

    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
//Entry point for the thread to run the banner

    public void run() {
        char ch;
        for (;;) {
            try {
                repaint();
                Thread.sleep(250);
                ch = str.charAt(0);
                str = str.substring(1, str.length());
                str += ch;
                if (stopFlag) {
                    break;
                }
            } catch (InterruptedException e) {
            }
        }
    }
//pause the banner function here

    public void stop() {
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics grp) {
        grp.drawString(str, 50, 30);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
