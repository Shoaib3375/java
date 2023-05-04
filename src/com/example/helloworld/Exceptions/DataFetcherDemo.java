package com.example.helloworld.Exceptions;

public class DataFetcherDemo {
    public void fetchData() {
        DataFetcher dataFetcher = new DataFetcher();
        String url = "https://google.com";
        try{
            dataFetcher.fetchFromUrl(url);
        }catch (CheckedException e){
            System.out.println("Unable to fetch data");
        }
    }
}
