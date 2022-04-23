package com.example.helloworld.typeCasting;

public class typecasting {
    public static void main(String[] args) {
        // When we change Data type one to another it's called type casting
        int x = 9_999_999;
        int y = 99_999_999;

//      int z = x * y;
        long z = x * (long) y;
        System.out.println("Z = " + z);//  We show an error
    }
}
