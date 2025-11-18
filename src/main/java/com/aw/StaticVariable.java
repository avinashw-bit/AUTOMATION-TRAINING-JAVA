package com.aw;

public class StaticVariable {
     // Static nested class BrowserConfig
     static class BrowserConfig {
        static String browserName = "Chrome";
    }

    public static void main(String[] args) {
        // Accessing static variable without creating an object
        System.out.println("Initial Browser: " + BrowserConfig.browserName);

        // Changing the static variable
        BrowserConfig.browserName = "Edge";

        // Printing the updated value
        System.out.println("Updated Browser: " + BrowserConfig.browserName);
    }
}


