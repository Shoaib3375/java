package com.example.helloworld.CollectionFrameWork.IterableAndIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntRange implements Iterable<Integer>{
    private final int start;
    private final int end;
    private final boolean rangeClosed;
    private int cursor;

    public IntRange(int start, int end){
        this(start, end, false);
    }

    public IntRange(int start, int end, boolean rangeClosed) {
        this.start = start;
        this.end = end;
        this.rangeClosed = rangeClosed;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntIterator();
    }
    public class IntIterator implements Iterator<Integer> {


        @Override
        public boolean hasNext() {
            if (rangeClosed){
                return cursor <= end;
            }else {
                return cursor < end;
            }
        }

        @Override
        public Integer next() {
            if (!hasNext()){
                cursor = start;
                throw new NoSuchElementException();
            }
            return  cursor++;
        }
    }

}
