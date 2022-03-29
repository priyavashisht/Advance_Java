/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Dhanur
 */
public class windowClose extends Frame {

    windowClose() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
}
