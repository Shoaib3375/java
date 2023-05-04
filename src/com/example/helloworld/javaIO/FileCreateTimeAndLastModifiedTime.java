package com.example.helloworld.javaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class FileCreateTimeAndLastModifiedTime {
    public static void main(String[] args) throws IOException {
        try {
            Path path = Path.of("src/com/example/helloworld/javaIO/hello.txt");
            BasicFileAttributes attr = Files.readAttributes(path,BasicFileAttributes.class);
            FileTime creationTime = attr.creationTime();
            System.out.println("Creation Time = " +creationTime);

            FileTime lastModifiedTime = attr.lastModifiedTime();
            System.out.println("Last Modified Time = " + lastModifiedTime);

            long size = attr.size();
            System.out.println("Size = " + size);
        } catch (IOException e){
            System.out.println("Could not read file ");
            e.printStackTrace();
        }

    }
}
