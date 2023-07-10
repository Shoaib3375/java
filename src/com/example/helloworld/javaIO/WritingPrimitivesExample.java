package com.example.helloworld.javaIO;

import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class WritingPrimitivesExample {
    public static void main(String[] args) {
        String fileName = "outpu.txt";
//        try(DataOutputStream dos = new DataOutputStream(new FilterOutputStream(fileName))){
//            dos.writeInt(152);
//            dos.writeDouble(4.24);
//            dos.writeBoolean(true);
//
//            dos.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
