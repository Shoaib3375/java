package com.example.helloworld.DSA.complexity.codeforces.div4;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            int total = 0;
            for (int i = 0; i < n; ++i) {
                int sqb = scanner.nextInt();
                total += sqb;
            }
            int root = (int) Math.sqrt(total);
            if (root * root == total) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
