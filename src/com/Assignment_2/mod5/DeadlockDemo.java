package com.Assignment_2.mod5;

public class DeadlockDemo {
    public static void main(String[] args) {

        final String resource1 = "Resource1";
        final String resource2 = "Resource2";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread1 locked Resource1");

                synchronized (resource2) {
                    System.out.println("Thread1 locked Resource2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread2 locked Resource2");

                synchronized (resource1) {
                    System.out.println("Thread2 locked Resource1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
