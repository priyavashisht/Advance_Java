/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dhanur
 */
import javax.swing.*;

public class Swing {

    public static void main(String[] args) {
        JFrame f = new JFrame();//creating instance of JFrame  
        JButton b = new JButton("click");//creating instance of JButton  
        b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height  
        f.add(b);//adding button in JFrame  
        f.setSize(400, 500);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
        JFrame f1 = new JFrame("Button Example");
        JButton b1 = new JButton("Click Here");
        b1.setBounds(50, 100, 95, 30);
        f1.add(b1);
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}
