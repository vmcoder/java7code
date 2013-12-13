package com.vilpesh.jee.threads;

import com.vilpesh.jee.threads.*;

public class DMain {
    public static void main(String[] args) {
        System.out.println("******* Dance Party given by ".concat(Thread.currentThread().getName().toUpperCase()).concat(" *******"));
        D1 d1 = new D1();
        D2 d2 = new D2();
        D3 d3 = new D3();
        
        Thread t1 = new Thread(d1);
        t1.setName("MJ");
        Thread t2 = new Thread(d2);
        t2.setName("Lady Gaga");
        Thread t3 = new Thread(d3);
        t3.setName("Jassi Singh");
        
        try {
            t1.start();
            synchronized(t1) {
                System.out.println("Electronic beats on...");
                t1.wait();
            }
            
            t2.start();
            synchronized(t2) {
                System.out.println("Rocking beats on...");
                t2.wait();
            }
            
            t3.start();
            synchronized(t3) {
                System.out.println("Indian beats on...");
                t3.wait();
            }
            
        } catch (InterruptedException ie) {
                System.out.println("Interrupted Exception in DMain " + ie.getMessage());
        } finally {
            System.out.println("******* Party ends ".concat("*******"));
        }
        
    }
}