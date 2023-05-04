package com.example.helloworld.javaIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        Path copyFrom = Path.of("src/com/example/helloworld/javaIO/hellow.txt");
        Path copyTo = Path.of("src/com/example/helloworld/javaIO/copiedd.txt");
        Files.copy(copyFrom,copyTo, StandardCopyOption.REPLACE_EXISTING);
    }
}
