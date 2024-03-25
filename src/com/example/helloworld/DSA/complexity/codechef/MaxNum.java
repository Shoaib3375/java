package com.example.helloworld.DSA.complexity.codechef;

import java.io.*;
import java.util.*;
public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, arr[i]);
        }
        System.out.println(ans);
    }
}
