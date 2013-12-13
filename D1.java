package com.vilpesh.jee.threads;

public class D1 implements Runnable {
    public void run() {
        synchronized(this) {
            System.out.println(".... ".concat(Thread.currentThread().getName()).concat(" dancing HipHop style....."));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                System.out.println("Interrupted Exception in D1 " + ie.getMessage());
            }
            this.notify();
        }
    }
}