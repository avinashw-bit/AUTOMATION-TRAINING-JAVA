// File: SelfStudy12.java
package com.aw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SelfStudy12 {
    public static void main(String[] args) {

        // Checked Exception: IOException
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e.getMessage());
        }

        // Unchecked Exception: ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e.getMessage());
        }
    }
}