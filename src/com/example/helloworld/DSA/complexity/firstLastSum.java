package com.example.helloworld.DSA.complexity;
import java.util.Scanner;
public class firstLastSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstDigit = number / 1000;
        int lastDigit = number % 10;
        int sum = firstDigit + lastDigit;
        System.out.println(sum);
    }
}
