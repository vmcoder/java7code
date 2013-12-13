package com.vilpesh.jee.threads;

/**
 * Program to demonstrate understanding of YIELD Thread concepts.
 * This class starts threads Y1 and Y2. When Y1 runs, it yields and lets any other run.
 * Supporting classes : Y1.java,Y2.java
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */
public class Y1 implements Runnable {
    public void run() {
        System.out.println(".... ".concat(Thread.currentThread().getName()).concat(" Thinking ....."));
        try {
            Thread.sleep(2000);
            Thread.yield();
            System.out.println(".... ".concat(Thread.currentThread().getName()).concat(" Finished Thinking .....given suggestion"));
        } catch (InterruptedException ie) {
            System.out.println("Interrupted Exception in Y1 " + ie.getMessage());
        }
    }
}