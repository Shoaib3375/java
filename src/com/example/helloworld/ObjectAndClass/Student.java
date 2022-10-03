package com.example.helloworld.ObjectAndClass;

public class Student {
    private final String name;
    private final double[] marks;

    public Student(String name, double[] marks){
        this.name = name;
        this.marks = marks;
    }
    public double totalMarks(){
        double totalMarks = 0.0;
        for (double mark : marks){
            totalMarks += mark;
        }
        return totalMarks;
    }
    public double average() {
        return totalMarks() / marks.length;
    }

}
