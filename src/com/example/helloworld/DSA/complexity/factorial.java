package com.example.helloworld.DSA.complexity;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; i++)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
