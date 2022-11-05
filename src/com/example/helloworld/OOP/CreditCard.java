package com.example.helloworld.OOP;

public class CreditCard {
    private final long number;
    private final int CVV;
    private final String validThrough;
    public CreditCard(long number, int CVV, String validThrough){
        this.number = number;
        this.CVV = CVV;
        this.validThrough = validThrough;
    }
}
