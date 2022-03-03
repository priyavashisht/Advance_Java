/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
package javaapplication1;

import java.applet.*;

import java.awt.*;

public class NewApplet4 extends Applet {

    String str = new String();

    public void init() {
        Font fnt = new Font("Ariel", Font.ITALIC, 20);
        Button btn = new Button("Hello");
        Button btn1 = new Button("Btn1");
        Button btn2 = new Button();
        btn.setFont(fnt);
        btn1.setFont(fnt);
        String var3, var1, var2;
        var1 = btn.getLabel();
        var2 = btn1.getLabel();
        var3 = var1 + var2;
        btn2.setLabel(var3);
        add(btn);
        btn.getLabel();
        btn1.setBackground(Color.red);
        btn.setBackground(Color.BLUE);
        btn2.setBackground(Color.DARK_GRAY);
        add(btn1);
        add(btn2);
    }
}
