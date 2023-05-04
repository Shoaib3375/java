package com.example.helloworld.javaIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        // 1st way
        Path filepath = Path.of("src/com/example/helloworld/javaIO/hello.java");
        if (!Files.exists(filepath)){
            Path file = Files.createFile(filepath);
            System.out.println("File = "+file);
            boolean exixts = Files.exists(file);
            System.out.println("Exist = " + exixts);
        }
        // 2nd way
//        File myfile = new File("src/com/example/helloworld/javaIO/hello.java");
//        boolean hasFileCreated = myfile.createNewFile();
//        System.out.println("hasFileCreated = " +hasFileCreated);
    }
}
