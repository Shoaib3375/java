package com.example.helloworld.CollectionFrameWork.Map;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class DuplicateFileFinder {
    public Map<String, List<Path>> findDuplicate(Path rootPath){
        Map<String, List<Path>> duplicateFileMap = new HashMap<>();

        Deque<Path> stack = new ArrayDeque<>();
        stack.push(rootPath);

        while (!stack.isEmpty()){
            Path currentFile = stack.pop();

            if (Files.isDirectory(currentFile)){
                for (File file : currentFile.toFile().listFiles()){
                    stack.push(file.toPath());
                }
            }else {
                String hash = hash(currentFile);
                List<Path> duplicates = duplicateFileMap.containsKey(hash) ? duplicateFileMap.get(hash) : new ArrayList<>();
                duplicates.add(currentFile);
                duplicateFileMap.put(hash, duplicates);
            }
        }
        return duplicateFileMap;
    }
    private String hash (Path rootPath){
        try{
            byte[] bytes = Files.readAllBytes(rootPath);
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);

            return new BigInteger(1, digest).toString(16);
        }catch (NoSuchAlgorithmException | IOException e){
            throw new RuntimeException(e);
        }
    }
    private  String hashForLargeFile(Path rootPath){
        try {
            InputStream stream = new FileInputStream(rootPath.toFile());
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] buffer = new byte[10_000];

            int read = 0;
            while ((read = stream.read(buffer)) != -1){
                md.update(buffer, 0, read);
            }
            return new BigInteger(1, md.digest()).toString(16);
        }catch (NoSuchAlgorithmException | IOException e){
            throw new RuntimeException(e);
        }
    }
}
