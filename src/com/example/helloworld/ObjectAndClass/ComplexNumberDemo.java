package com.example.helloworld.ObjectAndClass;

public class ComplexNumberDemo {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5.0, 6.0);
        ComplexNumber b = new ComplexNumber(-3.0, 6.0);

        System.out.println("a               = " + a);
        System.out.println("b               = " + b);
        System.out.println("b + a           = " + b.plus(a));
        System.out.println("a - b           = " + a.plus(b));
    }
}
