package com.example.helloworld.OOP;

import java.util.ArrayList;

public class ShoppingCard {
    private final ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public int getTotalPrice(){
        int totalPrice = 0;
        for (Product product : products){
            totalPrice +=product.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCard{" +
                "products=" + products +
                '}';
    }
}
