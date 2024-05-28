package com.example.helloworld.DSA.complexity.codeforces;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1) {
                    System.out.print("#");
                } else if (j == 1 && i % 4 == 0) {
                    System.out.print("#");
                } else if (j == m && (i + 2) % 4 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
