package com.example.helloworld.DSA.complexity.codeforces;


import java.util.PriorityQueue;
import java.util.Scanner;

public class TshirtBuying {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mx = 200123;
        int[] a = new int[mx];
        int[] b = new int[mx];
        int[] p = new int[mx];

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            p[i] = sc.nextInt();
        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        for (int i = 1; i <= n; i++)
            b[i] = sc.nextInt();

        PriorityQueue<Integer>[][] q = new PriorityQueue[5][5];
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                q[i][j] = new PriorityQueue<>();
            }
        }

        for (int i = 1; i <= n; i++) {
            q[a[i]][b[i]].add(p[i]);
        }

        int m = sc.nextInt();
        while (m-- > 0) {
            int c = sc.nextInt();
            int ans = Integer.MAX_VALUE;
            int f =0,g = 0;

            for (int i = 1; i <= 3; i++) {
                if (!q[c][i].isEmpty() && q[c][i].peek() < ans) {
                    ans = q[c][i].peek();
                    f = c;
                    g = i;
                }
            }

            for (int i = 1; i <= 3; i++) {
                if (!q[i][c].isEmpty() && q[i][c].peek() < ans) {
                    ans = q[i][c].peek();
                    f = i;
                    g = c;
                }
            }

            if (ans == Integer.MAX_VALUE) {
                ans = -1;
            } else {
                q[f][g].poll();
            }

            System.out.print(ans + " ");
        }
        System.out.println();
    }
}
