/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.*;
import java.awt.event.*;

public class cutCopy extends Frame {

    TextArea textArea;
    Button cutButton, copyButton, pasteButton;

    public cutCopy() {
        setTitle("Sample text area for testing cut copy paste");
        setLayout(new FlowLayout());
        textArea = new TextArea(5, 20);
        cutButton = new Button("Cut");
        pasteButton = new Button("Paste");
        copyButton = new Button("Copy");
        cutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == cutButton) {
                    //;
                } else if (ae.getSource() == copyButton) {
                    //c = a - b;
                } else if (ae.getSource() == pasteButton) {
                }
            }
        });
        add(textArea);
        add(cutButton);
        add(copyButton);
        add(pasteButton);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        new cutCopy();
    }
}
