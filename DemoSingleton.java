package com.vilpesh.jee;

import com.vilpesh.jee.Singleton;

/**
 * Aim: Demonstrate SINGLETON pattern concept.
 * Supporting Classes: DemoSingleton.java,Singleton.java classes.
 * 
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println("First object : " + obj1);
        Singleton obj2 = Singleton.getInstance();
        System.out.println("Second object : " + obj2);
        Singleton obj3 = Singleton.getInstance();
        System.out.println("Third object : " + obj3);
        
        System.out.println("------------------------------------");
        if(obj1.equals(obj2) && obj1.equals(obj3)) {
            System.out.println("All 3 objects refer to single instance of class !!");
        } else {
            System.out.println("Wrong Implementation of Singleton class");
        }
        System.out.println("------------------------------------");
    }
}