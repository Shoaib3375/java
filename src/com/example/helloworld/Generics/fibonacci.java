package com.example.helloworld.Generics;

import java.util.HashMap;
import java.util.Map;

public class fibonacci {
    static Map<Integer, Long> cache = new HashMap<>(
            Map.of(0,0L,1,1L)
    );
    public static Long fibonacci(int n){
        if (!cache.containsKey(n)){
            Long computed =fibonacci(n-1 ) + (n-2);
            cache.put(n,computed);
        }
        return cache.get(n);
    }

    public static void main(String[] args) {
        Long fibonacciof20 = fibonacci(20);
        System.out.println("fibonacci 20 " +fibonacciof20);
    }
}
