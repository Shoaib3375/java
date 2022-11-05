package com.example.helloworld.OOP;

public class Bird {
    private String name;
    private int age;

    public Bird(String name){
        this.name = name;
        this.age = 0;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void sing(){
        System.out.println("tweet tweet");
    }
}
