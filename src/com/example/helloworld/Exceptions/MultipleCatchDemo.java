package com.example.helloworld.Exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try{
            int numbers[] = new int[10];
            numbers[15] = 40/0;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            if (e instanceof ArithmeticException){
                System.out.println("You cannot divide by zero");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("The index you tried to access " + "does not exist");
            }
        }
    }
}
