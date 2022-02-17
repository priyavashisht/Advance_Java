/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javaapplication1;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Dhanur
 */
public class NewApplet1 extends Applet
        implements ActionListener {

    Image pic;
    AudioClip play;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        pic = getImage(getDocumentBase(), "ZOOM.JPG");
        play = getAudioClip(getDocumentBase(), "Sound.wav");
    }

    public void paint(Graphics g) {
        g.drawImage(pic, 40, 50, this);
        play.play();
    }

    public void actionPerformed(ActionEvent ae) {
    }
    // TODO overwrite start(), stop() and destroy() methods
}
