/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javaapplication1;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author Dhanur
 */
public class NewApplet5 extends Applet implements Runnable {

    Image whirlImages[] = new Image[4];
    Image nowImage;
    int whirlIndex = 0;
    Thread whirlThread;
    boolean animateFlag = true;

    public void init() {
        whirlImages[0] = getImage(getDocumentBase(), "c1.jpg");
        whirlImages[1] = getImage(getDocumentBase(), "c2.jpg");
        whirlImages[2] = getImage(getDocumentBase(), "c3.jpg");
        whirlImages[3] = getImage(getDocumentBase(), "c4.jpg");
    }

    public void start() {
        whirlThread = new Thread(this);
        whirlThread.start();
    }

    public void stop() {
        animateFlag = false;
    }

    public void run() {
        while (animateFlag) {
            nowImage = whirlImages[whirlIndex++];
            if (whirlIndex > 3) {
                whirlIndex = 0;
            }
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public void paint(Graphics g) {
        if (nowImage != null) {
            g.drawImage(nowImage, 10, 10, this);
        }
    }

}
