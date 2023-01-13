package com.example.helloworld.OOP.Polymorphism;

public class DrawingPad {
    public void draw(Shape shape){
        String actualType = shape.getClass().getTypeName();
        System.out.println("Actual type: " + actualType);
        System.out.println("Drawing " + shape.getName());
    }
}
