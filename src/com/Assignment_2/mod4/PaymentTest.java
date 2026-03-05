package com.Assignment_2.mod4;
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}
public class PaymentTest {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();

        p1.pay(500);
        p2.pay(300);
    }
}
