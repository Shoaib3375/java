package com.example.helloworld.DSA.complexity.codeforces.Div2;

import java.util.*;

public class GamerHemose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long h = sc.nextLong();

            List<Long> sz = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                sz.add(x);
            }


            Collections.sort(sz, Collections.reverseOrder());

            long s = sz.get(0) + sz.get(1);

            if (sz.get(0) >= h) {

                System.out.println(1);
            } else {

                long roundsWithTwoLargest = (h + s - 1) / s;
                long totalActionsCase1 = roundsWithTwoLargest * 2;


                long remainingAfterLargest = h - sz.get(0);
                long roundsWithPairs = (remainingAfterLargest + s - 1) / s;
                long totalActionsCase2 = roundsWithPairs * 2 + 1;


                long result = Math.min(totalActionsCase1, totalActionsCase2);

                System.out.println(result);
            }
        }
        sc.close();
    }
}
