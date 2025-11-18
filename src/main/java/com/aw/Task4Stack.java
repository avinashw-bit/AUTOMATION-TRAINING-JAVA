package com.aw;

import java.util.Stack;

public class Task4Stack {
    public static void main(String[] args) {
        // 1. Create a Stack<String> named 'pagesVisited'
        Stack<String> pagesVisited = new Stack<>();

        // 2. Push pages onto the stack
        pagesVisited.push("LoginPage");
        pagesVisited.push("HomePage");
        pagesVisited.push("CartPage");

        // 3. Pop one element (simulate “back” button)
        String lastVisited = pagesVisited.pop();
        System.out.println("Back from: " + lastVisited);

        // 4. Peek the current page on top
        String currentPage = pagesVisited.peek();
        System.out.println("Current Page: " + currentPage);

        // 5. Print all elements
        System.out.println("\nAll Pages Visited:");
        for (String page : pagesVisited) {
            System.out.println(page);
        }
    }
}

