package com.example.helloworld.CollectionFrameWork.Map;

import java.io.IOException;

public class TopFrequentWordFinderDemo {
    public static void main(String[] args) throws IOException {
        TopFrequentWordFinder finder = new TopFrequentWordFinder();
        String topWord = finder.findTopWord("src/com/example/helloworld/CollectionFrameWork/Map/eassy.txt");
        System.out.println("topWord = " + topWord);
    }
}
