/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
// importing the necessary libraries  

import java.awt.*;
import java.awt.event.*;

// class which inherits the WindowAdapter class  
public class windowClose extends WindowAdapter {
// object of Frame  

    Frame f;
// class constructor  

    windowClose() {
// creating the frame  
        f = new Frame();
// adding  WindowListener to the frame  
        f.addWindowListener(this);

// setting the size, layout and visibility of frame  
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

// overriding the windowClosing() method   
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }
// main method  

//    public static void main(String[] args) {
//        new windowClose();
//    }
}
