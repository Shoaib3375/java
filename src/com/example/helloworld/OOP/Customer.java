package com.example.helloworld.OOP;

public class Customer {
    private String name;
    private CreditCard creditCard;

    public Customer(String name, long number, int CVV, String validThrough){
        this.name = name;
        this.creditCard = new CreditCard(number,CVV, validThrough);
    }
    public Customer(String name, CreditCard creditCard){
        this.name = name;
        this.creditCard = creditCard;
    }
}
