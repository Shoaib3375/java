package com.example.helloworld.DSA.complexity.CSES;

import java.util.*;

public class mm {
    static final int MAX_N = 1000007;
    static int[] dp = new int[MAX_N];

    static int solve(int n) {
        if (n == 0) return 0;
        if (dp[n] != -1) return dp[n];

        int res = Integer.MAX_VALUE;
        int n2 = n;

        while (n2 > 0) {
            int digit = n2 % 10;
            if (digit != 0) {
                res = Math.min(res, 1 + solve(n - digit));
            }
            n2 /= 10;
        }

        return dp[n] = res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        Arrays.fill(dp, -1);  // Initialize DP array
        System.out.println(solve(n));
    }
}
