package com.Assignment_2.mod4;

public class GarbageCollectionDemo {
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
