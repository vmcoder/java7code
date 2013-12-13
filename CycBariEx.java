package com.vilpesh.jee.concur;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Aim: Demonstrate Cyclic Barrier concept in concurrency of Java 7.
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */

public class CycBariEx {
    public static void main (String[] args) {
        
        final CyclicBarrier cbar = new CyclicBarrier(3, new Runnable() {
            public void run() {
                System.out.println("Plane Boarded...Let's Fly");
            }
        });
        
        Thread t1 = new Thread(new CycBariHelper(cbar), "John");
        Thread t2 = new Thread(new CycBariHelper(cbar), "Jerry");
        Thread t3 = new Thread(new CycBariHelper(cbar), "Jacob");
        
        t1.start();
        t2.start();
        t3.start();        
    }
}

class CycBariHelper implements Runnable {
    private CyclicBarrier cb; 
    
    public CycBariHelper(CyclicBarrier cb) {
        this.cb = cb;
    }
    
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "...Waiting for others to Arrive");
            cb.await();
            System.out.println("All Arrived");
        } catch (InterruptedException ex) {
            Logger.getLogger(CycBariHelper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BrokenBarrierException ex) {
            Logger.getLogger(CycBariHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}