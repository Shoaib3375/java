package com.example.helloworld.javaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        InputStream in  = null;
        try {
            in = new FileInputStream("input1.txt");
            int c;
            while ((c = in.read()) != -1){
                System.out.println(c + ", ");
            }
        } catch (IOException e) {
            System.err.println("Could not read file");
            e.printStackTrace();
        }
        finally {
            if (in != null){
                try{
                    in.close();
                }catch (IOException e){
                    System.err.println("Unable to close FileINputStream");
                    e.printStackTrace();
                }
            }
        }
    }
}
