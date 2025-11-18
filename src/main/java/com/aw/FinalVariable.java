package com.aw;

public class FinalVariable {
    // Static nested class
    static class WaitConfig {
        // Final variable
        static final int MAX_WAIT_TIME = 30;
    }

    public static void main(String[] args) {
        System.out.println("Default Wait Time: " + WaitConfig.MAX_WAIT_TIME);

        // Uncommenting the line below will cause a compile-time error
        // WaitConfig.MAX_WAIT_TIME = 60; // ❌ Error: cannot assign a value to final variable
    }
}

