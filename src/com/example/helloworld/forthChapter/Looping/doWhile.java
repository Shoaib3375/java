package com.example.helloworld.forthChapter.Looping;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int number = 15;

        Scanner input = new Scanner(System.in);

        int guess;
        do {
            System.out.println("Guess a number");
            guess = input.nextInt();
            if (guess == number){
                System.out.println("Cong!" + "You guess the number");
            } else if (number > guess) {
                System.out.println("Opps!" + "The number is greater than" + guess);
            }else {
                System.out.println("The number less than " + guess);
            }
        }while (guess != number);
    }
}
