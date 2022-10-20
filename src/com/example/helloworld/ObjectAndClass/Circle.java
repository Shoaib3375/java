package com.example.helloworld.ObjectAndClass;

import java.util.PrimitiveIterator;

public class Circle {
    private int radius;
    private static int numberOfObjectCreated = 0;
    private static final double PI = 3.1416;
    public Circle(int radius){
        this.radius = radius;
        numberOfObjectCreated++;
    }
    public int getNumberOfObjectCreated(){
        return numberOfObjectCreated;
    }
    public double getArea(){
        return radius * radius * PI;
    }
}
