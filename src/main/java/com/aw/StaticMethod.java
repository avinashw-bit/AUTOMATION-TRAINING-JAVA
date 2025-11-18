package com.aw;

public class StaticMethod {
    
    static class BrowserConfig {
        static String browserName = "Chrome";

        // Static block
        static {
            System.out.println("Static block executed: Loading default browser configuration...");
        }

        // Static method
        static String getBrowserInfo() {
            return "Running tests on " + browserName + " browser";
        }
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");

        // Accessing static method directly
        System.out.println(BrowserConfig.getBrowserInfo());

        // Changing browser name
        BrowserConfig.browserName = "Edge";

        // Calling static method again
        System.out.println(BrowserConfig.getBrowserInfo());
    }
}


