package com.example.helloworld.ObjectAndClass;

public enum Suit {
    DIAMOND("♦"),
    HEARTS("❤"),
    CLUBS("♣"),
    SPADES("♠");

    private final String value;
    Suit(String value){
        this.value = value;
    }
    @Override
    public String toString(){
        return value;
    }
}
