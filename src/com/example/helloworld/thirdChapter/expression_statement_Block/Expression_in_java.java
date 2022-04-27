package com.example.helloworld.thirdChapter.expression_statement_Block;

import java.util.Scanner;

public class Expression_in_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, x, y;
        System.out.println("Enter value of x: ");
        x = input.nextInt();
        System.out.println("Enter value of y: ");
        y = input.nextInt();
        System.out.println("Enter value of a: ");
        a = input.nextInt();
        System.out.println("Enter vlaue of b: ");
        b = input.nextInt();

        double result = (x - 5) / 2.0 + 2*((55 -y) / (double) a - (b+9)/(double) y )/ 2.5 + 42;
        System.out.println("Result = " + result);
    }
}
