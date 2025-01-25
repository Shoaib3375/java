package com.example.helloworld.Experiment.serialization;


import com.example.helloworld.Experiment.serialization.student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws FileNotFoundException {
        student s1 = new student();
        s1.stuRollNo = 5;
        s1.stuName  = "Shoaib";
        String fileName = "F:\\javaProject\\book\\java\\src\\com\\example\\helloworld\\Experiment\\testfile.txt";
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object save in file");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
