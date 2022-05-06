package com.example.helloworld.forthChapter.DecisionMaking;

import java.util.Scanner;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your Yearly income: ");
        Scanner input = new Scanner(System.in);
        double income = input.nextDouble();

        double taxableIncome = income - 300_000; // no tax till 300_00

        double tax ;
        if (taxableIncome <= 100_000){
            tax = taxableIncome * 0.05;
        } else if (taxableIncome <= 100_000 + 300_000) {
            tax = (100_000 * 0.05) + ((taxableIncome - 100_000) * 0.10);
        } else if (taxableIncome <= (100_000 + 300_000 + 400_000)) {
            tax = (100_000 * 0.5) + (300_000 * 0.10) + ((taxableIncome -100_000)* 0.15);
        } else if (taxableIncome <= (100_000 + 300_000 + 400_000 + 500_000)) {
            tax = (100_000 * 0.05) + (300_000 * 0.10) + (400_000 * 0.15) + ((taxableIncome - (100_000 + 300_000 + 400_000)) * 0.20);
        }else {
            tax = (100_000 * 0.05 + 300_000 * 0.10 + 400_000 * 0.15 + 500_000 * 20) + (taxableIncome - (100_000 + 300_000 + 400_000 + 500_000 )) * 0.25;
        }
        System.out.println("your tax amount is : " + tax);
    }
}
