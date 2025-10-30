// File: EmployeeDemo.java
package com.aw;

// Employee class with encapsulation
class Employee {
    private String name;
    private int id;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Main class to test
public class SelfStudy10 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("Avinash");
        emp.setId(3101);
        emp.setSalary(75000.50);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Salary: ₹" + emp.getSalary());
    }
}
