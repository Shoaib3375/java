package com.example.helloworld.ObjectAndClass;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(15);
        Circle circle3 = new Circle(20);

        System.out.println("Area of circle1 = " + circle1.getNumberOfObjectCreated());
        System.out.println("Area of circle2 = " + circle2.getNumberOfObjectCreated());
        System.out.println("Area of circle3 = " + circle3.getNumberOfObjectCreated());
    }
}
