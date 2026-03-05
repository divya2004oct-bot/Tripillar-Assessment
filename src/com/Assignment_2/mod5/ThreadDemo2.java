package com.Assignment_2.mod5;
class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread using Runnable running");
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
