package com.example.helloworld.DSA.complexity.codeforces;

import java.util.Scanner;


public class c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] order = new int[n + 1];
            boolean[] used = new boolean[n + 1];

            generateOrder(order, used, n, k, 1);

            // Print the order
            for (int j = 1; j <= n; j++) {
                System.out.print(order[j] + " ");
            }
            System.out.println();
        }
    }

    private static void generateOrder(int[] order, boolean[] used, int n, int k, int position) {
        if (position > n) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                if (position <= k) {
                    order[position] = i + k;
                } else {
                    order[position] = i;
                }

                used[i] = true;
                generateOrder(order, used, n, k, position + 1);
                used[i] = false;
            }
        }
    }
}

