package com.example.helloworld.NIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChannelWriteExample {
    public static void main(String[] args) {
        String data = "Write once, run anywhere (WORA)";
        Path path = Path.of("src/com/example/helloworld/NIO/output.txt");
        if (!Files.exists(path)){
            System.out.println(path + " Doesn't exist, please create one.");
            return;
        }
        try(FileOutputStream fos = new FileOutputStream(path.toFile());
            FileChannel fileChannel = fos.getChannel()){
            byte[] bytes = data.getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(bytes);
            fileChannel.write(buffer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
