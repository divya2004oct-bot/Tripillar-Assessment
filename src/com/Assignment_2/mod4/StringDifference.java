package com.Assignment_2.mod4;

public class StringDifference {
    public static void main(String[] args) {

        String s = "Hello";
        s = s + " World";
        System.out.println("String: " + s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println("StringBuffer: " + sf);
    }
}
