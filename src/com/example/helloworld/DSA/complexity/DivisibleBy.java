package com.example.helloworld.DSA.complexity;


import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        char[] digits = number.toCharArray();

        int lastThreeDigits = (number.length() >= 3) ? Integer.parseInt(number.substring(number.length() - 3)) : Integer.parseInt(number);

        boolean divisibleBy2 = lastThreeDigits % 2 == 0;
        boolean divisibleBy4 = lastThreeDigits % 4 == 0;
        boolean divisibleBy8 = lastThreeDigits % 8 == 0;

        System.out.println(divisibleBy2 ? "Yes" : "No");
        System.out.println(divisibleBy4 ? "Yes" : "No");
        System.out.println(divisibleBy8 ? "Yes" : "No");

        scanner.close();

    }
}
