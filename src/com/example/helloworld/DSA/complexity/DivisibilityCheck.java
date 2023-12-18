package com.example.helloworld.DSA.complexity;
import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();
        boolean divisibleBy2 = num % 2 == 0;
        boolean divisibleBy4 = num % 4 == 0;
        boolean divisibleBy8 = num % 8 == 0;

        System.out.println((divisibleBy2 ? "Yes" : "No"));
        System.out.println((divisibleBy4 ? "Yes" : "No"));
        System.out.println((divisibleBy8 ? "Yes" : "No"));
        scanner.close();
    }
}
