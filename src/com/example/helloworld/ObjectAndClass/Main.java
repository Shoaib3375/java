package com.example.helloworld.ObjectAndClass;
public class Main {
    public enum Level{
        HIGH(3), MEDIUM(2), LOW(1);
        private final int levelCode;
        Level(int levelCode){
            this.levelCode = levelCode;
        }
        public int getLevelCode(){
            return this.levelCode;
        }
    }
}
