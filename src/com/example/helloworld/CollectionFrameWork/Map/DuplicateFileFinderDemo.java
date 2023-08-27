package com.example.helloworld.CollectionFrameWork.Map;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class DuplicateFileFinderDemo {
    public static void main(String[] args) throws IOException {
        DuplicateFileFinder finder = new DuplicateFileFinder();
        Map<String, List<Path>> dupFiles = finder.findDuplicate(Path.of("src/com/example/helloworld/fiveChapter"));

        System.out.println("Duplicate files: ");
        Collection<List<Path>> values = dupFiles.values();
        for (List<Path> value: values){
            System.out.println(value);
        }
    }
}
