package com.aw;

public class Expressionpart3 {
    public static void main(String[] args) {
        // Simple Expression
        int length = 5;
        int breadth = 3;
        int area = length * breadth;
        System.out.println(area);

        // Math Expression (average)
        int marks1 = 80;
        int marks2 = 90;
        int marks3 = 70;
        double average = (marks1 + marks2 + marks3) / 3.0;
        System.out.println(average);

        // String Expression (full name)
        String firstName = "Avinash";
        String lastName = "Waghmare";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Combined Expression (percentage)
        int totalMarks = 500;
        int obtained = 420;
        double percentage = (obtained * 100.0) / totalMarks;
        System.out.println(percentage);
    }
}
