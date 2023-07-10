package com.example.helloworld.javaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        String text = """
                mvgvwRK wet - AvjdvR
                mvaviY wet - mt cªavb	imvqb - bvRgyj
                A_©bxwZ - wkDwj
                """;
        try(Writer writer = new FileWriter("src/com/example/helloworld/javaIO/outpu.txt")){
            writer.write(text);
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
