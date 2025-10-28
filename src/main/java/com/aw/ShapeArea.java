package com.aw;

import java.util.ArrayList;
import java.util.List;

class Shape {
    void area() {
        System.out.println("Generic shape area");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle area: " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Rectangle area: " + result);
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        for (Shape s : shapes) {
            s.area();  // Calls overridden method based on actual object type
        }
    }
}


