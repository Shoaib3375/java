package com.example.helloworld.DSA.complexity.CPS;

import java.util.Scanner;

public class MSort {
    static long[] num = new long[100000];
    static long[] temp = new long[100000];

    public static void mergesort(int lo, int hi) {
        if (lo == hi) return;
        int mid = (lo + hi) / 2;

        mergesort(lo, mid);
        mergesort(mid + 1, hi);

        int i, j, k;
        for (i = lo, j = mid + 1, k = lo; k <= hi; k++) {
            if (i == mid + 1) temp[k] = num[j++];
            else if (j == hi + 1) temp[k] = num[i++];
            else if (num[i] < num[j]) temp[k] = num[i++];
            else temp[k] = num[j++];
        }
        if (hi + 1 - lo >= 0) System.arraycopy(temp, lo, num, lo, hi + 1 - lo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                num[i] = scanner.nextLong();
            }

            mergesort(0, n - 1);

            for (int i = 0; i < n; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
