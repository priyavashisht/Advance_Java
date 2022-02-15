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
public class NewApplet2 extends Applet 
implements ActionListener{
   Image pic;
   Button play,stop;
   AudioClip audioClip;
   public void init(){
      pic = getImage(getDocumentBase(),"dk.jpg");
      play = new Button("  Play in Loop  ");
      add(play);
      play.addActionListener(this);
      stop = new Button("  Stop  ");
      add(stop);
      stop.addActionListener(this);
      audioClip = getAudioClip(getDocumentBase(),"Sound.wav");
   }
public void paint(Graphics g) {  
    g.drawImage(pic, 30,30, this);  
  }  
public void actionPerformed(ActionEvent ae){
 Button source = (Button)ae.getSource();
      if (source.getLabel() == "  Play in Loop  "){
         audioClip.play();
      }  
      else if(source.getLabel() == "  Stop  "){
         audioClip.stop();
      }
   }
}
