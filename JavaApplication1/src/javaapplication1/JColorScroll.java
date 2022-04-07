package javaapplication1;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class SetScrollBar extends JFrame implements AdjustmentListener {

    JLabel labelRed, labelGreen, labelBlue;
    JScrollBar sBarRed, sBarGreen, sBarBlue;

    SetScrollBar() {
        //setting layout
        setLayout(new FlowLayout());
        JFrame f = new JFrame();

        //initializing label for each scrollbar;
        labelRed = new JLabel("Adjust Red:");
        labelGreen = new JLabel("Adjust Green:");
        labelBlue = new JLabel("Adjust Blue:");

        //initializing scrollbar
        sBarRed = new JScrollBar(JScrollBar.HORIZONTAL, 0, 5, 0, 255);
        sBarGreen = new JScrollBar(JScrollBar.HORIZONTAL, 0, 5, 0, 255);
        sBarBlue = new JScrollBar(JScrollBar.HORIZONTAL, 0, 5, 0, 255);

        //Setting Size
        //sBarRed.setBounds(1000, 0, 1000, 0);
        sBarRed.setSize(100, 100);
        //adding eventlistener
        sBarRed.addAdjustmentListener(this);
        sBarGreen.addAdjustmentListener(this);
        sBarBlue.addAdjustmentListener(this);

        //adding label and scrollbar to the frame;
        add(labelRed);
        add(sBarRed);
        add(labelGreen);
        add(sBarGreen);
        add(labelBlue);
        add(sBarBlue);
    }//end of constructor;

    public void adjustmentValueChanged(AdjustmentEvent event) {
        int cRed, cGreen, cBlue; //store value of scrollbar
        cRed = sBarRed.getValue(); //getting current value of scroll bar;
        cGreen = sBarGreen.getValue();
        cBlue = sBarBlue.getValue();

        getContentPane().setBackground(new Color(cRed, cGreen, cBlue)); //change the background color;
    }//end of event handler
} //end of SetScrollBar class

public class JColorScroll {

    public static void main(String[] args) {
        SetScrollBar demo = new SetScrollBar();
        demo.setSize(1000, 400);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setVisible(true);
    }
}
