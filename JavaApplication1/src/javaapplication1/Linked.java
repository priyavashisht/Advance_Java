/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Dhanur
 */
public class Linked {
//Their Objects are created and function called in JavaApplication1.java
    public void listlink() {
        LinkedList<String> ll = new LinkedList<String>();
        for (int i = 0; i < 4; i++) {
            ll.add("Number " + i);
        }
        Iterator<String> iter = ll.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
