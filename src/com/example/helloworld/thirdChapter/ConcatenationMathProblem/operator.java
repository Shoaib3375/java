package com.example.helloworld.thirdChapter.ConcatenationMathProblem;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Int this programm. we know about relational operator.
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("Enter another number: ");
        int b = input.nextInt();
        boolean isAGreaterThanB = a>b;
        if (isAGreaterThanB){
            System.out.println(a + " is greater than " + b);
        }
        boolean isALessThanB = a<b;
        if(isALessThanB){
            System.out.println(a + " is less than "+ b);
        }

    }
}
