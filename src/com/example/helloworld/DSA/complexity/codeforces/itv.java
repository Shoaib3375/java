package com.example.helloworld.DSA.complexity.codeforces;

import java.util.Scanner;

public class itv {
    public static int calc(int a, int b) {
        int s = a / (b - 1);  // Same as 107 / 9 = 11
        int ss = s * (b - 1);
        int dif = a - ss;
        int ans = s - dif;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shirts (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the number of bags (b): ");
        int b = sc.nextInt();
        System.out.println("ans: " + calc(a, b));
    }
}
