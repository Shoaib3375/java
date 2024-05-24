package com.example.helloworld.DSA.complexity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  subArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n + 1];
        long[] sum = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + a[i]; // Note: sum[i - 1] instead of sum[i] to accumulate correctly
        }
//5 7
//2 4 1 2 7
        int ans = 0;
        Map<Long, Integer> cnt = new HashMap<>();
        cnt.put(0L, 1);

        for (int i = 1; i <= n; i++) {
            long minusSum = sum[i] - x;
            ans += cnt.getOrDefault(minusSum, 0);
            cnt.put(sum[i], cnt.getOrDefault(sum[i], 0) + 1);
        }

        System.out.println(ans);
    }
}
