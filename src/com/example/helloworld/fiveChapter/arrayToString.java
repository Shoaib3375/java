package com.example.helloworld.fiveChapter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrayToString {
    public static void main(String[] args) {
    int[] num = {32, 4, 2, 432, 423,11, 3};
// shakib problem Int array to String
    String N = "";
    for(int i = 0; i < num.length; ++i){
        N+=num[i];
        if (i!= num.length - 1)N+=" ";
    }
        System.out.println('"'+ N + '"');
    }
}
