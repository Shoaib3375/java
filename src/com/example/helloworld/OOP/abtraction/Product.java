package com.example.helloworld.OOP.abtraction;

import java.awt.*;

public class Product {
    private static final int SHIPPING_RATE = 5;
    private static final double DIMENSION_CHARGE = 1.5;

    private final String name;
//    private final int weight;
//    private final Dimension dimension;
    private int price;
    private int discount;

    public Product(String name, int price, int discount,int weight, Dimension dimension){
        this.name = name;
        this.price = price;
        this.discount = discount;
//        this.weight = dimension;
    }
    public int getPrice(){
        return price;
    }
}
