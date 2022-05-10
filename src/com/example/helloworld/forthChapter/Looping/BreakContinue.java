package com.example.helloworld.forthChapter.Looping;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0){
                continue; // we skiped the even number & just print odd number :D
            }
            System.out.println("The number is : " + i);
            if(i == 9){
                break;
            }
        }
    }
}
