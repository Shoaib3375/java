package com.example.helloworld.thirdChapter.Practice;

import java.util.Scanner;

public class BmiChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Weight in Kilogram: ");
        double w = input.nextDouble();
        System.out.println("Enter your height in meter : ");
        double h = input.nextDouble();
        double bmi = w / (h* h);
        System.out.println("Your bmi = " +bmi);
    }
}
