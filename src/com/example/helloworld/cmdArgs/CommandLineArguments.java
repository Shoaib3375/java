package com.example.helloworld.cmdArgs;

public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("args : " );
        for (String arg : args){
            System.out.println(arg);
        }
    }
}
