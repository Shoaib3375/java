package com.example.helloworld.Exceptions;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        int result = 0;
        try {
            result = divide(a,b);
        }catch (ArithmeticException e){
            System.out.println("You cannot divide " + a +" by " + b);
        }
        System.out.println("result = " + result);
    }
    private static int divide(int a, int b){
        return a / b;
    }
}
