package com.example.helloworld.OOP.abtraction;

public class Dimension {
    private final int height;
    private final int length;
    private final int width;
    public Dimension(int height, int length, int width){
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public int getVolume(){
        return this.height * length * width;
    }
}
