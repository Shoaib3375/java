package com.example.helloworld.ObjectAndClass;

public class enumwithOrdinal {
    public enum Transport{
        plane(40), train(33), bus(22);
        int speed;
        Transport(int s){
            speed = s;
        }

        public static void main(String[] args) {
            Transport tp = Transport.train;
            if (tp.ordinal() < 2){
                System.out.println("It's not a bus");
            }
        }
    }
}
