package com.aw;
import java.util.ArrayList;
import java.util.Iterator;

public class SelfStudy6 {
    public static void main(String[] args) {
        // Step 1: Create and populate the ArrayList
        ArrayList<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Safari");

        // Task 1: Use a for-each loop to print all browsers
        System.out.println("Browsers using for-each loop:");
        for (String browser : browsers) {
            System.out.println(browser);
        }

        // Task 2: Use an Iterator to remove one element during iteration
        Iterator<String> iterator = browsers.iterator();
        while (iterator.hasNext()) {
            String browser = iterator.next();
            if (browser.equals("Edge")) {
                iterator.remove(); // Safely remove "Edge"
            }
        }

        // Print updated list
        System.out.println("\nBrowsers after removing 'Edge' using Iterator:");
        for (String browser : browsers) {
            System.out.println(browser);
        }
    }
}
