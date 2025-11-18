package com.aw;

public class StaticBlock {

    static class BrowserConfig {
        static String browserName = "Chrome";

        // Static block
        static {
            System.out.println("Static block executed: Loading default browser configuration...");
        }
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");

        // Accessing static variable triggers class loading
        System.out.println("Initial Browser: " + BrowserConfig.browserName);

        // Changing the static variable
        BrowserConfig.browserName = "Edge";
        System.out.println("Updated Browser: " + BrowserConfig.browserName);
    }
}

