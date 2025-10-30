// File: SelfStudy8.java
package com.aw;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void displayStudentInfo() {
        super.displayInfo();
        System.out.println("Course: " + this.course);
    }
}

// Main class to test
public class SelfStudy8 {
    public static void main(String[] args) {
        Student s1 = new Student("Avinash", 30, "Java Automation");
        s1.displayStudentInfo();
    }
}