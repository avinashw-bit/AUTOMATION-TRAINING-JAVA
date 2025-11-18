package com.aw;
import java.util.HashSet;

public class Task5HashSet {
           public static void main(String[] args) {
            // 1. Create a HashSet<String> for 'apiEndpoints'
            HashSet<String> apiEndpoints = new HashSet<>();
    
            // 2. Add endpoints
            apiEndpoints.add("POST /addOrder");
            apiEndpoints.add("GET /orderStatus");
            apiEndpoints.add("POST /addOrder"); // duplicate
            apiEndpoints.add("DELETE /cancelOrder");
    
            // 3. Print all endpoints
            System.out.println("API Endpoints:");
            for (String endpoint : apiEndpoints) {
                System.out.println(endpoint);
            }
    
            // 4. Observation
            System.out.println("\nObservation:");
            System.out.println("- Duplicates are NOT allowed.");
            System.out.println("- Order is NOT guaranteed in HashSet.");
        }
    }

