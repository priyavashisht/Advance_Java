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
public class ArryClass {
//Their Objects are created and function called in JavaApplication1.java
    public void str() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    /*We cannot call run direct as it'll show warning that it doesn't have any main method()
    /*
import java.util.*;
class TestJavaCollection1{
public static void main(String args[]){  
}
}
}
     */
}
