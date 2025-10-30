package com.aw;
import java.util.*;

public class SelfStudy5 {
   

    public static void main(String[] args) {
        // 1. ArrayList of browser names
        ArrayList<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Chrome"); // duplicate
        System.out.println("🧭 ArrayList of browsers:");
        for (String browser : browsers) {
            System.out.println("- " + browser);
        }

        // 2. HashSet to remove duplicates
        HashSet<String> uniqueBrowsers = new HashSet<>(browsers);
        System.out.println("\n🚫 HashSet (duplicates removed):");
        for (String browser : uniqueBrowsers) {
            System.out.println("- " + browser);
        }

        // 3. HashMap of TestCaseName -> Status
        HashMap<String, String> testResults = new HashMap<>();
        testResults.put("LoginTest", "Passed");
        testResults.put("SignupTest", "Failed");
        testResults.put("CheckoutTest", "Passed");
        System.out.println("\n📋 Test Case Results:");
        for (Map.Entry<String, String> entry : testResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4. LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("\n🔢 LinkedList before removal: " + numbers);
        numbers.removeFirst(); // remove first element
        System.out.println("🗑️ LinkedList after removing first: " + numbers);
    }
}

