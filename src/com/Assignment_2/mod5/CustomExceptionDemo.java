package com.Assignment_2.mod5;
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
public class CustomExceptionDemo {
    static void check(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number cannot be negative");
        } else {
            System.out.println("Number: " + num);
        }
    }
    public static void main(String[] args) {
        try {
            check(-5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
