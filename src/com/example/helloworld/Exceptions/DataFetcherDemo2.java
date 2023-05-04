package com.example.helloworld.Exceptions;

public class DataFetcherDemo2 {
    public void fetchData() throws CheckedException{
        DataFetcher dataFetcher = new DataFetcher();
        String url = "https://google.com";
        dataFetcher.fetchFromUrl(url);
    }
}
