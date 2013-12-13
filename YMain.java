package com.vilpesh.jee.threads;

import com.vilpesh.jee.threads.*;

/**
 * Program to demonstrate understanding of YIELD Thread concepts.
 * This class starts threads Y1 and Y2. When Y1 runs, it yields and lets any other run.
 * Supporting classes : Y1.java,Y2.java
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */

public class YMain {
    public static void main(String[] args) {
        Y1 y1 = new Y1();
        Thread t = new Thread(y1);
        System.out.println("******* Help needed by ".concat(Thread.currentThread().getName().toUpperCase()).concat(" *******"));
        t.start();
        System.out.println("******* Was i helped ?");
    }
}