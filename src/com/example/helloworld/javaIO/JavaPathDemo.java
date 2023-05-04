package com.example.helloworld.javaIO;

import java.nio.file.Path;

public class JavaPathDemo {
    public static void main(String[] args) {
        Path path = Path.of("src/com/example/helloworld/javaIO/hello.txt");
        System.out.println(path);
    }
}
