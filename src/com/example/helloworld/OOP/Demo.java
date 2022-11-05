package com.example.helloworld.OOP;

public class Demo {
    public static void main(String[] args) {
        ShoppingCard shoppingCard = new ShoppingCard();
        Product keyboard = new Product("Mechanical Keyboard", 48);
        Product Mouse = new Product("Gaming Mouse", 48);
        Product ecoDot = new Product("Eco Dot (4th Generation)", 40);
        shoppingCard.addProduct(keyboard);
        shoppingCard.addProduct(Mouse);
        shoppingCard.addProduct(ecoDot);
        System.out.println("ShoppingCard + " + shoppingCard);
        int totalPrice = shoppingCard.getTotalPrice();
        System.out.println("totalPrice = " + totalPrice);
    }
}
