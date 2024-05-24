package com.example.helloworld.DSA.complexity.codeforces;

import java.util.Scanner;

public class binaryExp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toBinaryString(n);
        String reverseS = new StringBuilder(s).reverse().toString();
        if (s.equals(reverseS)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
