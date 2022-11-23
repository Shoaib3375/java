package com.example.helloworld.OOP.Inheritance;

import com.example.helloworld.OOP.Inheritance.Vehicle;

public class Bus extends Vehicle {
    int noOfWheels = 6;
    public void printWheels(){
        System.out.println("Number of wheels in Bus: " + noOfWheels);
        System.out.println("Number of wheels in Vehicle: " +super.noOfWheels); // we can use super keyword in Variable also :D
    }
}
