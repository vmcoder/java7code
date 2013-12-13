package com.vilpesh.jee.threads;

/**
 * Aim: Demonstrate JOIN concept in Threads.
 * Supporting Classes: W1.java,W2.java,W3.java,W4.java classes.
 * WMain class starts a party.To serve water,juice,pastries and collect empty dishes or glasses, calls W1 to W4 worker classes.
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */

public class W4 implements Runnable {

    public void run() {
        try {
            for (int i = 0; i <= 2; i++) {
                System.out.println("----- ".concat(Thread.currentThread().getName()).concat(" Collecting empty dish/glasses-----"));
                Thread.sleep(8000);
            }
        } catch (InterruptedException ie) {
            System.out.println("Interrupted Exception in W4 " + ie.getMessage());
        }
    }
}