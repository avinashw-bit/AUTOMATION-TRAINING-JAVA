package com.aw;
import java.util.ArrayList;
import java.util.Iterator;


public class Task1ArrayList {

    public static void main(String[] args) {
        // 1. Create an ArrayList<String> named 'testCases'
        ArrayList<String> testCases = new ArrayList<>();

        // 2. Add test case names
        testCases.add("LoginTest");
        testCases.add("LogoutTest");
        testCases.add("AddItemTest");
        testCases.add("AddItemTest");

        // 3. Print all test case names
        System.out.println("All Test Cases: " + testCases);

        // 4. Access the second element and print it
        System.out.println("Second Test Case: " + testCases.get(1));

        // 5. Remove one element and print the updated list
        testCases.remove("AddItemTest"); // removes the first occurrence
        System.out.println("After Removing 'AddItemTest': " + testCases);

        // 6a. Iterate using normal 'for' loop
        System.out.println("\nIterating using normal for loop:");
        for (int i = 0; i < testCases.size(); i++) {
            System.out.println("Index " + i + ": " + testCases.get(i));
        }

        // 6b. Iterate using enhanced 'for' loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String testCase : testCases) {
            System.out.println(testCase);
        }

        // 6c. Iterate using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = testCases.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

