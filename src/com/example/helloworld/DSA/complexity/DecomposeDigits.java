package com.example.helloworld.DSA.complexity;

import java.util.Scanner;
public class DecomposeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int hundreds = Math.abs(n) / 100;
        int tens = (Math.abs(n) / 10) % 10;
        int ones = Math.abs(n) % 10;

        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);
    }
}
