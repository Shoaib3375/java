package com.example.helloworld.NIO;

import java.nio.ByteBuffer;

public class BufferReadWrite {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(8);
        System.out.println("Right after creation : ");
        printBuffer(bb);
        for (int i = 10; i < 18; i++){
            bb.put((byte) i);
        }
        System.out.println("After population Data: ");
        printBuffer(bb);
    }

    private static void printBuffer(ByteBuffer bb) {
        int limit = bb.limit();
        System.out.println("Position: " + bb.position() + ", " + "limit: " + limit);
        System.out.print("Data: ");
        for (int i = 0; i < limit; i++){
            System.out.print(bb.get(i) + " ");
        }
        System.out.println();
    }
}
