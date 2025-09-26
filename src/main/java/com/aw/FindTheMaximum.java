package com.aw;

public class FindTheMaximum {

    // Method to return the larger of two numbers
    public static int max(int a, int b) {
        if (a > b) {
            return a;  // return a if it’s larger
        } else {
            return b;  // return b otherwise
        }
    }

    public static void main(String[] args) {
        System.out.println("Max of 10 and 20 is: " + max(10, 20));
        System.out.println("Max of 50 and 25 is: " + max(50, 25));
        System.out.println("Max of 100 and 200 is: " + max(100, 200));
        System.out.println("Max of 125 and 124 is: " + max(125, 124));
    }

}
