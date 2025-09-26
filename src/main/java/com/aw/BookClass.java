package com.aw;

public class BookClass {

    // Fields
    String title;
    String author;

    // Method to display info
    void showInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

    class BookDemo {
    public static void main(String[] args) {
        // Create first book object
        BookClass b1 = new BookClass();
        b1.title = "Pride and Prejudice";
        b1.author = "Jane Austen";

        // Create second book object
        BookClass b2 = new BookClass();
        b2.title = "Wings of Fire";
        b2.author = "A.P.J. Abdul Kalam";

        // Create third book object
        BookClass b3 = new BookClass();
        b3.title = "To Kill a Mockingbird";
        b3.author = "Harper Lee";

        // Print info
        b1.showInfo();
        b2.showInfo();
        b3.showInfo();
    }
}
