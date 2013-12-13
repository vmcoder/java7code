package com.vilpesh.jee.threads;

/**
 * Aim: Demonstrate JOIN concept in Threads.
 * Supporting Classes: W1.java,W2.java,W3.java,W4.java classes.
 * WMain class starts a party.To serve water,juice,pastries and collect empty dishes or glasses, calls W1 to W4 worker classes.
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */

import com.vilpesh.jee.threads.*;

public class WMain {
    public static void main(String[] args) {
        System.out.println("@@@@@@@@ Party given by ".concat(Thread.currentThread().getName().toUpperCase()).concat(" @@@@@@@@"));
        W1 w1 = new W1();
        W2 w2 = new W2();
        W3 w3 = new W3();
        W4 w4 = new W4();
        
        Thread t1 = new Thread(w1);
        t1.setName("Waiter 1");
        Thread t2 = new Thread(w2);
        t2.setName("Waiter 2");
        Thread t3 = new Thread(w3);
        t3.setName("Waiter 3");
        Thread t4 = new Thread(w4);
        t4.setName("Waiter 4");
        
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
            t4.start();
            t4.join();
        } catch (InterruptedException ie) {
            System.out.println("Interrupted Exception in WMain " + ie.getMessage());
        } finally {
            System.out.println("@@@@@@@@ Party ends ".concat("@@@@@@@@"));
        }
    }
}