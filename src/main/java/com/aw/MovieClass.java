package com.aw;

public class MovieClass {

    // Fields
    String title;
    double rating;

    // Method to print movie details
    void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Rating: " + rating + " / 10");
        System.out.println("----------------------");
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        // Create first movie
        MovieClass movie1 = new MovieClass();
        movie1.title = "War2";
        movie1.rating = 9.1;

        // Create second movie
        MovieClass movie2 = new MovieClass();
        movie2.title = "Kantara";
        movie2.rating = 8.7;

        // Show details
        movie1.printDetails();
        movie2.printDetails();
    }
}
