package com.example.helloworld.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCopiere {
    public static void main(String[] args) {
        Path sourcePath = Path.of("src/com/example/helloworld/NIO/hello.txt");
        Path destinationPath = Path.of("src/com/example/helloworld/NIO/output.txt");

        copy(sourcePath,destinationPath);
    }
    public static void copy(Path sourcePath, Path destPath){
        if (!Files.exists(sourcePath)|| !Files.exists(destPath)){
            System.out.println("sourch or destination file " + "does not exist");
            return;
        }
        try (
            FileChannel srcChannel = new FileInputStream(sourcePath.toFile()).getChannel();
            FileChannel sinkChannel = new FileOutputStream(destPath.toFile()).getChannel()) {
            srcChannel.transferTo(0, srcChannel.size(), sinkChannel);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
