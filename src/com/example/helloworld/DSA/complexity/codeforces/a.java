package com.example.helloworld.DSA.complexity.codeforces;

import java.util.Scanner;

import java.util.HashMap;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
//            int n = scanner.nextInt();
            String s = scanner.next();
            int ans = 0;
            HashMap<Character, Integer> mpp = new HashMap<>();

            for (char it : s.toCharArray()) {
                mpp.put(it, mpp.getOrDefault(it, 0) + 1);
            }

            for (HashMap.Entry<Character, Integer> entry : mpp.entrySet()) {
                char key = entry.getKey();
                int value = entry.getValue();

                if (value >= s.indexOf(key) + 1) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
