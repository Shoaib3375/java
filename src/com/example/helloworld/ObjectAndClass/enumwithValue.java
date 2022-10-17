package com.example.helloworld.ObjectAndClass;

public class enumwithValue {
    enum Transport{
        Train, Plane, Automobile
    }

    public static void main(String[] args) {
        Transport alltransport [] = Transport.values();
        for (Transport t : alltransport){
            System.out.println(t);
        }
    }
}
