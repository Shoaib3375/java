package com.example.helloworld.OOP.Polymorphism.shape;

public class ShapeFactory {
    public Shape newShape(String type){
        return new Shape();
    }
}
