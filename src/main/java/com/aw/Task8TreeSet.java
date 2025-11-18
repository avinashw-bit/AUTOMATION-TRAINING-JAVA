package com.aw;
import java.util.TreeSet;
    import java.util.SortedSet;
    
public class Task8TreeSet {
    
        public static void main(String[] args) {
            // 1. Create a TreeSet<String> named 'countries'
            TreeSet<String> countries = new TreeSet<>();
    
            // 2. Add country names
            countries.add("India");
            countries.add("USA");
            countries.add("Germany");
            countries.add("Australia");
            countries.add("India"); // duplicate
    
            // 3. Print all countries — observe natural sorting
            System.out.println("All Countries (Sorted): " + countries);
    
            // 4. Use TreeSet methods
            System.out.println("First Country: " + countries.first());
            System.out.println("Last Country: " + countries.last());
    
            SortedSet<String> head = countries.headSet("Germany");
            SortedSet<String> tail = countries.tailSet("Germany");
    
            System.out.println("Countries before 'Germany': " + head);
            System.out.println("Countries from 'Germany' onward: " + tail);
        }
    }
