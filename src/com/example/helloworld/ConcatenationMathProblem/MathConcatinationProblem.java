package com.example.helloworld.ConcatenationMathProblem;

public class MathConcatinationProblem {
    public static void main(String[] args) {
        String greetings = "hello" + "World";
        System.out.println(greetings);
        String name = "Shoaib";
        System.out.println("Hello" + name);
        // Others way to add use data Type variable to make String : Like->
        int hour = 4;
        String message = "We have been waiting here for over " + hour + "Hours";
        // Others example
        System.out.println(5 + 4 + "Abcd");
        System.out.println(5 + 3 *2 + "Abcd");
        System.out.println( "Abcd" + 5 + 3 *3);
    }
}
