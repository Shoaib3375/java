package com.example.helloworld.javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
   public static void main(String[] args) {
        String destination = "src/com/example/helloworld/javaIO/input1.txt";
        String data = "I love java programming Language.";
        OutputStream fos = null;
        try{
            fos = new FileOutputStream(destination);
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.flush();
        }catch (IOException e){
            System.out.println("Unable to write text in " +destination);
            e.printStackTrace();
        }finally {
            if (fos != null){
                try {
                    fos.close();
                }catch (IOException e){
                    System.err.println("Unable to close the outputStream");
                    e.printStackTrace();
                }
            }
        }
    }
}
