package com.example.helloworld.javaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRenamingExample {
    public static void main(String[] args) throws IOException {
        try {

            Path oldFilePath = Path.of("src/com/example/helloworld/javaIO/hello.txt");
            Path targetPath = Path.of("src/com/example/helloworld/javaIO/hello_renamed.txt");
            Path moved = Files.move(oldFilePath, targetPath);
            System.out.println(moved);
        }catch (IOException e){
            e.getMessage();
            System.out.println("No file find / file already rename");
        }
    }
}
