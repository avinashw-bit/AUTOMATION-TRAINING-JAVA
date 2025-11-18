package com.aw;

public class FinalMethod {
        // Trying to override a final method (this will cause a compile-time error)
    /*
    @Override
    void setup() {
        System.out.println("LoginTest setup overridden");
    }
    */

    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.setup(); // Calls the inherited final method
    }
}

// Base class with a final method
class BaseTest {
    final void setup() {
        System.out.println("Base setup complete");
    }
}

