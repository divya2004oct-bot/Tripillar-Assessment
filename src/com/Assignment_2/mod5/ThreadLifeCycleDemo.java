package com.Assignment_2.mod5;
class LifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }
}
public class ThreadLifeCycleDemo {
    public static void main(String[] args) {

        LifeCycle t = new LifeCycle();

        System.out.println("State after creation: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());
    }
}
