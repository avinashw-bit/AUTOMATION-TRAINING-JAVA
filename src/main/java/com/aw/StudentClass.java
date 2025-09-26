package com.aw;

// Student.java
public class StudentClass {

    // Fields
    String name;
    int age;

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

    class StudentDemo {
    public static void main(String[] args) {
        // Create first student object
        StudentClass s1 = new StudentClass();
        s1.name = "Alok";
        s1.age = 25;

        // Create second student object
        StudentClass s2 = new StudentClass();
        s2.name = "Priya";
        s2.age = 29;

        // Display details
        s1.display();
        s2.display();
    }
}
