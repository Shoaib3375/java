package com.example.helloworld.NIO;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileChannelWriteExampleWithUTF8 {
    public static void main(String[] args) {
        String data = """
                iweevi BwZnvm - Ky‡njx
                """;
        Path path = Path.of("src/com/example/helloworld/NIO/output.txt");
        if (!Files.exists(path)){
            System.out.println(path + " doesn't exist, please create one.");
            return;
        }
        try (FileOutputStream fos = new FileOutputStream(path.toFile());
             FileChannel fileChannel = fos.getChannel()){
            Charset charset = StandardCharsets.UTF_8;
            CharBuffer charBuffer = CharBuffer.wrap(data);
            ByteBuffer encodedBuffer = charset.encode(charBuffer);
            fileChannel.write(encodedBuffer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
