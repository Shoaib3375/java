package com.example.helloworld.forthChapter.DecisionMaking;

import java.util.Scanner;

public class VoterChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you: ");
        double age = input.nextDouble();

        if (age >=18){
            System.out.println("Congratulation! " + "You're eligible to vote");
        }else if (age <= 18 && age >= 12){
            System.out.println("Sorry Baby " + "Just your Children i hope you're eligible after few years");
        }else {
            System.out.println(" you're just little");
        }
    }
}
