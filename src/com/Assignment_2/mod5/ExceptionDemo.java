package com.Assignment_2.mod5;
import java.io.*;
public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("test.txt"); // Checked Exception
        } catch (IOException e) {
            System.out.println("Checked Exception handled");
        }

        try {
            int a = 10 / 0; // Unchecked Exception
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled");
        }
    }
}
