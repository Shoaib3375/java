package com.example.helloworld.DSA.complexity;

import java.util.Scanner;



public class swap_Delete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            System.out.println(minCost(s));
        }

        scanner.close();
    }

    static int minCost(String s) {
        int n = s.length();
        int[] dp = new int[n + 1]; // dp[i] stores the minimum cost to make the first i characters of s good

        // Base case: empty string is good
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);

            // Case 1: delete the current character
            dp[i] = Math.min(dp[i - 1] + 1, dp[i]);

            // Case 2: find the first matching character to swap with (if any)
            for (int j = i - 2; j >= 0; j--) {
                if (s.charAt(j) == c) {
                    dp[i] = Math.min(dp[i], dp[j] + i - j - 1);
                    break;
                }
            }
        }

        return dp[n];
    }
}
