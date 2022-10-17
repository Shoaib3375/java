package com.example.helloworld.DSA.complexity;

import java.util.Scanner;

public class nthnum {
    public static void main(String[] args) {
        int n, result;

        Scanner in = new Scanner(System.in);
        System.out.print("Input Number : ");
        n = in.nextInt();
        result = n * (n + 1)/2;

        System.out.println("Result = " + result);

    }
}
