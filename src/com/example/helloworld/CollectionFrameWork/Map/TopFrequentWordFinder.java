package com.example.helloworld.CollectionFrameWork.Map;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TopFrequentWordFinder {

    public String findTopWord(String path) throws IOException{
        Path eassyPath = Path.of(path);
        if (!Files.exists(eassyPath)){
            throw new FileNotFoundException(eassyPath + "Doesn't Exist");
        }
        String eassy = Files.readString(eassyPath);
        String[] words = eassy.split("[\\p{Punct}\\s]+");

        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word: words){
            if (wordFrequencyMap.containsKey(word)){
                Integer count = wordFrequencyMap.get(word);
                wordFrequencyMap.put(word, count + 1);
            }else {
                wordFrequencyMap.put(word,1);
            }
        }
        int maxCount = 0;
        String topWord = "";

        Set<Map.Entry<String, Integer>> entries = wordFrequencyMap.entrySet();

        for (Map.Entry<String, Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > maxCount){
                maxCount = value;
                topWord = key;
            }
        }
        return topWord;
    }
}
