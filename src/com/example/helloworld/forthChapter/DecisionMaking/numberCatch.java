package com.example.helloworld.forthChapter.DecisionMaking;

import java.util.Scanner;

public class numberCatch {
    public static void main(String[] args) {
        int number = 15;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess anumber: ");

        int guess = input.nextInt();

        if (guess == number){
            System.out.println("Congratulations! " + " you Guessed the number Corectly");
        } else if (number > guess){
            System.out.println("the number is grater than " + guess);
        }else System.out.println("The number is less than " + guess);
    }
}
