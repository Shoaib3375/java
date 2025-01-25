package com.example.helloworld.DSA.complexity.testing;

import java.util.Scanner;

public class Fibonacci {
    // Method to calculate Fibonacci using recursion
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for 'n'
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Printing Fibonacci series up to 'n'
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
