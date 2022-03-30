/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.*;
import java.awt.event.*;

public class cutCopy extends Frame implements ActionListener {

    TextArea textArea;
    Button cutButton, copyButton, pasteButton;
    public String s1;

    cutCopy() {//constructor
        setTitle("Sample text area for testing cut copy paste");
        setLayout(new FlowLayout());
        textArea = new TextArea(5, 20);
        cutButton = new Button("Cut");
        pasteButton = new Button("Paste");
        copyButton = new Button("Copy");
        cutButton.addActionListener(this);
        pasteButton.addActionListener(this);
        add(textArea);
        add(cutButton);
        add(copyButton);
        add(pasteButton);
        setSize(500, 250);
        setLocationRelativeTo(null);
        setVisible(true);
//public void run(){}
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cutButton) {
            s1 = textArea.getSelectedText();//copy to clipboard
        } else if (ae.getSource() == copyButton) {
        } else if (ae.getSource() == pasteButton) {
            if (textArea != null) {
                textArea.append(s1);//append it to last text written
            }
        }
    }

    public static void main(String args[]) {
        new cutCopy();
    }
}
