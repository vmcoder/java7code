package com.vilpesh.jee.threads;

/**
 * Program to demonstrate understanding of YIELD Thread concepts.
 * This class starts threads Y1 and Y2. When Y1 runs, it yields and lets any other run.
 * Supporting classes : Y1.java,Y2.java
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */

public class Y2 implements Runnable {
    public void run() {
        System.out.println(".... ".concat(Thread.currentThread().getName()).concat(" Starting big work ....."));
        for(int i = 0; i <= 3000; i++) if(i%1000 == 0) System.out.println(i);
        System.out.println(".... ".concat(Thread.currentThread().getName()).concat(" Finished computing"));
    }
}