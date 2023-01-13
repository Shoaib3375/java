package com.example.helloworld.OOP.Abstract;

public abstract class Animal {
    private final int legs;
    private String name;
    public Animal(int legs, String name){
        this.legs = legs;
        this.name = name;
    }
    @Override
    public String toString(){
        return (name + " has " + legs +  "leg(s)");
    }
}
