package com.example.helloworld.DSA.complexity;


import java.util.Scanner;

public class LadderLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int v = scanner.nextInt();

        double angleInRadians = Math.toRadians(v);
        double ladderLength = Math.ceil(h / Math.sin(angleInRadians));

        System.out.println(Math.round(ladderLength));

        scanner.close();
    }
}
