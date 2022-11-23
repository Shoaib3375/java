package com.example.helloworld.OOP.Polymorphism.shape;

public class CircleFactory extends ShapeFactory{
    @Override
    public Circle newShape(String type){return new Circle();
    }

}
