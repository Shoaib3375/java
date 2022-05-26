package com.example.helloworld.forthChapter.Looping.pattern;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int n = in.nextInt();

        for (int row = 1; row <= n; row ++){
            for (int col = 1; col <=row; col++){
                System.out.print(" " +col);
            }
        }
    }
}
