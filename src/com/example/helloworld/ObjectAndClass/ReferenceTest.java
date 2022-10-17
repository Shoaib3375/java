package com.example.helloworld.ObjectAndClass;

import java.awt.Point;

public class ReferenceTest {
    public static void main(String[] args) {
        Point a;
        Point b;
        a = new Point(100, 100);
        b = a;
        b.x = 200;
        b.y = 200;
        System.out.println("a: " + a.x + ", " + a.y);
        System.out.println("b: " + b.x + ", " + b.y);
    }
}
