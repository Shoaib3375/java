package com.example.helloworld.Exceptions;

public class DataFetcher {
    public String fetchFromUrl(String url) throws CheckedException {
        if (url == null){
            throw new CheckedException("Url not found");
        }
        String data = null;
        return data;
    }
}
