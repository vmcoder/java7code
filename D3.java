package com.vilpesh.jee.threads;

public class D3 implements Runnable {
    public void run() {
        synchronized(this) {
            System.out.println(".... ".concat(Thread.currentThread().getName()).concat(" dancing BhanGRA style....."));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ie) {
                System.out.println("Interrupted Exception in D3 " + ie.getMessage());
            }
            this.notify();
        }
    }
}