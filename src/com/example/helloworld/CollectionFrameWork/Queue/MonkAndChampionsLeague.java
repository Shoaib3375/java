package com.example.helloworld.CollectionFrameWork.Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MonkAndChampionsLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        PriorityQueue<Long> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < m; i++) {
            long x = scanner.nextLong();
            q.add(x);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (!q.isEmpty()) {
                long a = q.poll();
                ans += a;
                a--;
                if (a > 0)
                    q.add(a);
            }
        }

        System.out.println(ans);
    }
}