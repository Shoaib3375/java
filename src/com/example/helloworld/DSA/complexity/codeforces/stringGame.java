package com.example.helloworld.DSA.complexity.codeforces;

import java.util.*;

public class stringGame {

    static final int mx = (int) 2e5 + 123;
    static String s, t;
    static int n, m;
    static boolean[] removed = new boolean[mx];
    static int[] a = new int[mx];


    static boolean check(int val) {
        Arrays.fill(removed, false);


        for (int i = 1; i <= val; i++) removed[a[i] - 1] = true;


        for (int i = 0, j = 0; i < n; i++) {
            if (removed[i]) continue;
            if (s.charAt(i) == t.charAt(j)) {
                j++;
                if (j == m) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        s = sc.next();
        t = sc.next();
        n = s.length();
        m = t.length();


        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        int l = 0, r = n;
        int ans = 0;


        while (l <= r) {
            int mid = (l + r) / 2;

            if (check(mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
