package com.Assignment_2.mod5;
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread using Thread class running");
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
