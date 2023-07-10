package com.example.helloworld.NIO;

import java.nio.CharBuffer;

public class CharBufferReadWrite {
    public static void main(String[] args) {
        CharBuffer cb = CharBuffer.allocate(8);
        System.out.println("Right After Creation : ");
        printCharBuffer(cb);
        for (int i = 65; i < 73; i++){
            cb.put((char) i);
        }

    }

    private static void printCharBuffer(CharBuffer cb) {
        int limit = cb.limit();
        System.out.println("Position: " + cb.position() + ", " + "limit: " +limit);
        System.out.println("Data: ");
        for (int i = 0; i < limit; i++){
            System.out.println(cb.get(i) + " ");
        }
        System.out.println();
    }
}
