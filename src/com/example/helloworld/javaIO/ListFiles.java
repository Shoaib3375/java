package com.example.helloworld.javaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        Path myWorkingDir = Path.of("src/com/example/helloworld/javaIO");
        try(Stream<Path> list = Files.list(myWorkingDir)) {
            list.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
