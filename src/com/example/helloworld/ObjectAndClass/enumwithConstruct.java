package com.example.helloworld.ObjectAndClass;

public class enumwithConstruct {
    public enum Transport{
        plane(40), train(33), bus(22);
        int speed;
        Transport(int s){
            speed = s;
        }

        public static void main(String[] args) {
            System.out.println(Transport.plane.speed);
        }
    }

}
