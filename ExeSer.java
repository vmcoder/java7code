package com.vilpesh.jee.concur;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Aim: Demonstrate ExecutorService concept in concurrency of Java 7.
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */
public class ExeSer {
    
    public static void main (String[] args) {
           System.out.println("Starting Thread ...... " + Thread.currentThread().getName());
           ExecutorService es = Executors.newFixedThreadPool(3);
            
           for(int i = 0; i <= 2; i++) {
                if(i == 0) { 
                    es.execute(new Tablet()); 
                } else {
                    Runnable runn = new Runnable() {
                        public void run() {
                            System.out.println("I am " + Thread.currentThread().getName());
                        }
                    };
                    es.execute(runn);
                }
           }
            
           es.shutdown();
            
           while(!es.isTerminated()) {
             try {
                Thread.sleep(3000);
             } catch (InterruptedException ex) {
                Logger.getLogger(ExeSer.class.getName()).log(Level.SEVERE, null, ex);
             }
           }
           System.out.println("Finishing Thread ...... " + Thread.currentThread().getName());
    }
}

class Tablet implements Runnable {
    public void run() {
          System.out.println("Tablet here sending data ... " + Thread.currentThread().getName());
    }
}