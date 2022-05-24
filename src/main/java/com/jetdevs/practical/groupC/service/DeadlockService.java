package com.jetdevs.practical.groupC.service;

import org.springframework.stereotype.Service;

@Service
public class DeadlockService {
    public String deadlockDemo(){

        String firstResource = "This is first resource";
        String secondResource = "This is second resource";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (firstResource) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                    }
                    synchronized (secondResource) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (secondResource) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);

                    } catch (Exception e) {

                    }

                    synchronized (firstResource) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
        return "";
    }
}
