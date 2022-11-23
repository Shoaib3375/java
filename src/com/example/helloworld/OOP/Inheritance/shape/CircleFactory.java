package com.example.helloworld.OOP.Inheritance.shape;

public class CircleFactory extends ShapeFactory{
    @Override
    public Circle newShape(String type){return new Circle();
    }

}
