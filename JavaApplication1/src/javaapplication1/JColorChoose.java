package javaapplication1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class JColorChoose extends JFrame implements ActionListener {

    JButton b;
    Container c;

    JColorChoose() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        JColorChoose ch = new JColorChoose();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
