package com.example.helloworld.javaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try(InputStream in = new FileInputStream("src/com/example/helloworld/javaIO/input1.txt")){
            int c;
            while ((c = in.read())!= -1){
                System.out.print((char) c);
            }
        }catch (IOException e){
            System.out.println("Could not read file");
            e.printStackTrace();
        }
    }
}
