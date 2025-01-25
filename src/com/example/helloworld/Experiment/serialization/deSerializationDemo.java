package com.example.helloworld.Experiment.serialization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class deSerializationDemo {

    private static final Logger logger = Logger.getLogger(deSerializationDemo.class.getName());

    public static void main(String[] args) {
        String fileName = "F:\\javaProject\\book\\java\\src\\com\\example\\helloworld\\Experiment\\testfile.txt";

        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            student obj = (student) ois.readObject();
            System.out.println("Student Roll No: " + obj.stuRollNo);
            System.out.println("Student Name: " + obj.stuName);

        } catch (FileNotFoundException e) {
            logger.log(Level.SEVERE, "File not found: " + fileName, e);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "I/O error occurred during deserialization", e);
        } catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE, "Class not found during deserialization", e);
        }
    }
}
