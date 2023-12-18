package com.example.helloworld.DSA.complexity;

import java.util.Scanner;
public class MiddleDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int middleDigits = (n / 10) % 100;

        System.out.println(middleDigits);
    }
}

