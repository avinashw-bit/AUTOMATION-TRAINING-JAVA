package com.aw;

public class SkipBlanksInNames {

    public static void main(String[] args) {
        String[] names = { "Amit", "", "Ravi", "Sneha" };

        for (String name : names) {
            if (name.isEmpty()) {
                continue; // Skip empty strings
            }
            System.out.println(name);
        }
    }
}


