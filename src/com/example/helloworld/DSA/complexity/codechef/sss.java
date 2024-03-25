package com.example.helloworld.DSA.complexity.codechef;

import java.util.Scanner;

public class sss {

    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int result = countDecodableSubsequences(s);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int countDecodableSubsequences(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int[] lastIndex = {-1, -1, -1, -1};  // 'a', 'b', 'ab', 'aa'

        for (int i = 0; i < n; i++) {
            dp[i] = (i > 0 ? (2 * dp[i - 1] % MOD) % MOD : 1);

            if (s.charAt(i) == 'a') {
                dp[i] = (dp[i] + dp[lastIndex[3]] % MOD) % MOD;
            } else if (s.charAt(i) == 'b') {
                dp[i] = (dp[i] + dp[lastIndex[2]] % MOD) % MOD;
            } else if (i > 0 && s.substring(i - 1, i + 1).equals("c")) {
                dp[i] = (dp[i] + dp[lastIndex[1]] % MOD) % MOD;
            }

            lastIndex[getIndex(s.charAt(i))] = i;
        }

        return dp[n - 1];
    }

    private static int getIndex(char c) {
        return switch (c) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            default -> 3;
        };
    }
}
