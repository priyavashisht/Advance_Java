/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameColorChoose extends JFrame implements ActionListener {

    JFrame f;
    JButton b;
    JTextArea ta;

    JFrameColorChoose() {
        f = new JFrame("Color Chooser Example.");
        b = new JButton("Pad Color");
        b.setBounds(200, 250, 100, 30);
        ta = new JTextArea();
        ta.setBounds(10, 10, 300, 200);
        b.addActionListener(this);
        f.add(b);
        f.add(ta);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "Choose", Color.CYAN);
        ta.setBackground(c);
    }

    public static void main(String[] args) {
        new JFrameColorChoose();
    }
}
