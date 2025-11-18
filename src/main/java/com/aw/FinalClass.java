package com.aw;

public class FinalClass {
    
    public static void main(String[] args) {
        System.out.println("Base URL: " + TestConstants.BASE_URL);
        System.out.println("Username: " + TestConstants.USERNAME);
        System.out.println("Password: " + TestConstants.PASSWORD);
    }
}

// Final class with constants
final class TestConstants {
    static final String BASE_URL = "https://example.com";
    static final String USERNAME = "admin";
    static final String PASSWORD = "password123";
}

