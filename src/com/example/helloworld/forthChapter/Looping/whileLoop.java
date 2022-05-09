package com.example.helloworld.forthChapter.Looping;

public class whileLoop {
    public static void main(String[] args) {
        // Math log of (n)
        System.out.println("n \tlog10(n) \tlog2(n) \tlog3(n)");
        System.out.println("-------------------------------------");
        int n=1;
        while (n <=10){
            double log10 = Math.log10(n);
            double log2 = Math.log(n) / Math.log(2);
            double loge = Math.log(n);
            String row = String.format("%d:" + "\t%.6f\t%.6f" + "\t%.6f", n, log10, log2, loge);
            System.out.println(row);
            n++; // increment the loop variable
        }
    }
}
