package com.example.helloworld.OOP.Inheritance;

import com.example.helloworld.ObjectAndClass.Calculator;

public class AdvanceCalculator extends Calculator {
//    @Override // we get an Error
    public int add(int a, int b){
        int r = a + b;
        //
        if (((a^ r) & (b ^r)) < 0){
            throw new ArithmeticException("integer overflow");
        }
        return r;
    }
}
