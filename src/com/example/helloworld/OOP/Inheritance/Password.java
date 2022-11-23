package com.example.helloworld.OOP.Inheritance;

public final class Password {
    private char[] hash;
    public Password(char[] hash){
        this.hash = hash; // we aren't extend the class . Because we use final keyword
    }
}
