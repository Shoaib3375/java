package com.example.helloworld.thirdChapter.typeCasting;

public class NarrowingDataLoss {
    public static void main(String[] args) {
        long y = 1_233_720_377_580L;
        System.out.println("Long vlaue: " +y);
        int x = (int) y;
        System.out.println("After Narrowing primitive conversion : " + x);
        // !We fetch DataLoss problem in Narrowing primitive conversion :D
    }
}
