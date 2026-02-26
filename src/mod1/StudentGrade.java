package mod1;

import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();
        char grade;

        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else if (marks >= 50) grade = 'E';
        else grade = 'F';

        switch (grade) {
            case 'A': System.out.println("Grade: A"); break;
            case 'B': System.out.println("Grade: B"); break;
            case 'C': System.out.println("Grade: C"); break;
            case 'D': System.out.println("Grade: D"); break;
            case 'E': System.out.println("Grade: E"); break;
            default: System.out.println("Grade: F");
        }
        sc.close();
    }
}
