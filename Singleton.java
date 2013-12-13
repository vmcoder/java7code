package com.vilpesh.jee;

/**
 * Aim: Demonstrate SINGLETON pattern concept.
 * Supporting Classes: DemoSingleton.java,Singleton.java classes.
 * 
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */

public class Singleton {
    
    private static Singleton instance = new Singleton();
    
    private Singleton() { }
    
    public static Singleton getInstance() {
        return instance;
    }
}
