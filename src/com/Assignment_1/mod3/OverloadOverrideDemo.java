package com.Assignment_1.mod3;

class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int multiply(int a, int b) {
        return super.multiply(a, b) + 10; // overriding
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Overloading: " + c.multiply(2, 3, 4));

        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("Overriding: " + ac.multiply(2, 3));
    }
}
