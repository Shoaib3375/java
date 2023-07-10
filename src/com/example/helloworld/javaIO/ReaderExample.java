package com.example.helloworld.javaIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) {
        try(Reader reader = new FileReader("src/com/example/helloworld/javaIO/input1.txt")){
            int c;
            while ((c = reader.read()) != -1){
                char ch = (char) c;
                System.out.print(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
