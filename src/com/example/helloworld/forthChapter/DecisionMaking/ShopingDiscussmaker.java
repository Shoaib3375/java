package com.example.helloworld.forthChapter.DecisionMaking;

import java.util.Scanner;
import java.util.Stack;

public class ShopingDiscussmaker {
    static final boolean DISCOUNT_AVAILABLE = true;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();

        if (isAffordable(price)){
            buyProduct();
        }else if(isLittleExpensive(price)) {
            if (isDiscountAvailable()) {
                buyProduct();
            } else {
                addThisProductOnWishList();
            }
        } else {
            dontBuyThisProduct();
        }

    }

    private static void dontBuyThisProduct(){
        System.out.println("I will not buy this product");
    }

    private static void addThisProductOnWishList(){
        System.out.println("I will buy it later");
    }

    private static boolean isDiscountAvailable(){
        return DISCOUNT_AVAILABLE;
    }

    private static boolean isLittleExpensive(int price){
        if (500 < price && price <1000){
            return true;
        }else{
            return false;
        }
    }

    private static void buyProduct(){
        System.out.println("I will buy it");
    }
    private static boolean isAffordable(int price){
        if (price <=300 ){
            return true;
        }else
            return false;
    }
}

