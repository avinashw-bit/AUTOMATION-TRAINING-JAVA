package com.aw;

// Base class
class Printer {
    void print(String text) {
        System.out.println("Text: " + text);
    }

    void print(int number) {
        System.out.println("Number: " + number);
    }
}

// Subclass
class ColorPrinter extends Printer {
    @Override
    void print(String text) {
        System.out.println("Color: " + text);
    }
}

// Main class
public class PrinterExample {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        Printer p2 = new ColorPrinter();

        // Testing Printer
        p1.print("Hello Nagpur");       // Output: Text: Hello
        p1.print(123);           // Output: Number: 123

        // Testing ColorPrinter (overridden method)
        p2.print("Hello Pune");       // Output: Color: Hello
        p2.print(456);           // Output: Number: 456 (inherited from Printer)
    }
}