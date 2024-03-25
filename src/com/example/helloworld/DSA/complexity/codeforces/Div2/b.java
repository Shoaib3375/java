package com.example.helloworld.DSA.complexity.codeforces.Div2;

import java.util.Scanner;
import java.util.Arrays;

public class b {

    public static long countTriangles(int[] sticks) {
        long count = 0;
        int n = sticks.length;

        Arrays.sort(sticks);

        for (int i = 0; i < n - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < n - 1; j++) {
                while (k < n && sticks[i] + sticks[j] > sticks[k]) {
                    k++;
                }
                count += k - j - 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] sticks = new int[n];
            for (int j = 0; j < n; j++) {
                sticks[j] = scanner.nextInt();
            }

            long result = countTriangles(sticks);
            System.out.println(result);
        }
    }
}
