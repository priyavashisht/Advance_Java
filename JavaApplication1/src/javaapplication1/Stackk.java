/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Dhanur
 */
public class Stackk {

    //Their Objects are created and function called in JavaApplication1.java
    public void stck() {
        Stack<String> stc = new Stack<String>();
        for (int i = 0; i < 4; i++) {
            stc.push("This is line " + i);
        }
        //stc.pop();
        Iterator<String> Itr = stc.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }
    }
}
