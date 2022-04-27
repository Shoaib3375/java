package com.example.helloworld.thirdChapter.Practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bkashCharge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("৳#.##"); // 2 digit decimal number after dot :D
        System.out.println("Enter your amount: ");

        double amount =input.nextDouble();
        double charge = (1.8/100) * amount;
        String formattedAmount = decimalFormat.format(charge);
        System.out.println(formattedAmount);
//        double amount =15_000.12560;
//        String formattedAmount = decimalFormat.format(amount);
//        System.out.println( formattedAmount);
    }
}
