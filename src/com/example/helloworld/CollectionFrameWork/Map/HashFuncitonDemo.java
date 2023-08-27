package com.example.helloworld.CollectionFrameWork.Map;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFuncitonDemo {
    public static void main(String[] args) {
        Path path = Path.of("src/com/example/helloworld/CollectionFrameWork/Map/eassy.txt");
        String hash = hash(path);
        System.out.println("hash = " + hash);
    }
    public static String hash(Path path){
        try{
            byte[] bytes = Files.readAllBytes(path);
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
            return new BigInteger(1, digest).toString(16);
        }catch (NoSuchAlgorithmException | IOException e){
            throw new RuntimeException(e);
        }
    }
}
