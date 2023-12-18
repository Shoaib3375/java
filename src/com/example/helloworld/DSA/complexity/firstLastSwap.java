package com.example.helloworld.DSA.complexity;

import java.util.Scanner;
public class firstLastSwap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        int remainingDigits = number % 1000 / 10;
        int swappedNumber = lastDigit * 1000 + remainingDigits * 10 + firstDigit;

        System.out.println(swappedNumber);
    }
}
