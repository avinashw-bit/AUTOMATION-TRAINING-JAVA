package com.aw;
import java.util.LinkedList;

public class Task2LinkedList {
   

    public static void main(String[] args) {
        // 1. Create a LinkedList<String> named 'browsers'
        LinkedList<String> browsers = new LinkedList<>();

        // 2. Add "Chrome", "Edge", "Firefox"
        browsers.add("Chrome");
        browsers.add("Edge");
        browsers.add("Firefox");

        // 3. Add "Safari" at the first position and "Opera" at the last position
        browsers.addFirst("Safari");
        browsers.addLast("Opera");

        // 4. Remove "Edge"
        browsers.remove("Edge");

        // 5. Print all browsers
        System.out.println("Available Browsers:");
        for (String browser : browsers) {
            System.out.println(browser);
        }
    }
}
