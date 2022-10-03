package com.example.helloworld.ObjectAndClass;

public class MethodOverloading {
    int performAddition(int a, int b){
        int result = a + b;
        return result;
    }

    public float performAddition(float a, float b){
        float result = a + b;
        return result;
    }

    public double performAddition(double a, double b){
        double result = a + b;
        return result;
    }
}
