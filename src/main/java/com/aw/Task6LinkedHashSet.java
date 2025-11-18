package com.aw;
import java.util.LinkedHashSet;

public class Task6LinkedHashSet {
 

        public static void main(String[] args) {
            // 1. Create a LinkedHashSet<String> named 'executedTests'
            LinkedHashSet<String> executedTests = new LinkedHashSet<>();
    
            // 2. Add test names
            executedTests.add("LoginTest");
            executedTests.add("AddToCartTest");
            executedTests.add("PaymentTest");
            executedTests.add("LoginTest"); // duplicate
    
            // 3. Print all elements
            System.out.println("Executed Tests (in insertion order):");
            for (String test : executedTests) {
                System.out.println(test);
            }
    
            // Observation
            System.out.println("\nObservation:");
            System.out.println("- Duplicates are NOT allowed.");
            System.out.println("- Insertion order IS preserved in LinkedHashSet.");
        }
    }
