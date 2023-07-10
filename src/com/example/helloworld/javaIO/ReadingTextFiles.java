package com.example.helloworld.javaIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingTextFiles {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("helloworld.java");
        String text = Files.readString(path);
        System.out.println(text);
    }
}
