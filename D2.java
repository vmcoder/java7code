package com.vilpesh.jee.threads;

public class D2 implements Runnable {
    public void run() {
        synchronized(this) {
            System.out.println(".... ".concat(Thread.currentThread().getName()).concat(" dancing rOcK style....."));
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ie) {
                System.out.println("Interrupted Exception in D2 " + ie.getMessage());
            }
            this.notify();
        }
    }
}