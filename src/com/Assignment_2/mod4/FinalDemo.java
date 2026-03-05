package com.Assignment_2.mod4;
final class FinalClass {
    final int x = 10;

    final void display() {
        System.out.println("Final method called");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
        System.out.println("Final variable: " + obj.x);
    }

}
