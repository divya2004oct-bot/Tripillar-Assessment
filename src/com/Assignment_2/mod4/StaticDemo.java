package com.Assignment_2.mod4;
class Student {
    static String college = "ABC College";
    String name;

    Student(String n) {
        name = n;
    }

    static void displayCollege() {
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Student.displayCollege();

        Student s1 = new Student("John");
        Student s2 = new Student("Alice");

        s1.display();
        s2.display();
    }
}
