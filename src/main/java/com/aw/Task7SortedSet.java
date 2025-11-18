package com.aw;
import java.util.SortedSet;
    import java.util.TreeSet;
    
public class Task7SortedSet {
    
        public static void main(String[] args) {
            // 1. Create a SortedSet<Integer> named 'responseTimes'
            SortedSet<Integer> responseTimes = new TreeSet<>();
    
            // 2. Add response times (duplicates will be ignored)
            responseTimes.add(320);
            responseTimes.add(150);
            responseTimes.add(180);
            responseTimes.add(450);
            responseTimes.add(150); // duplicate
    
            // 3. Print the sorted set
            System.out.println("Sorted Response Times: " + responseTimes);
    
            // 4. Remove the smallest and largest elements
            Integer smallest = responseTimes.first();
            Integer largest = responseTimes.last();
            responseTimes.remove(smallest);
            responseTimes.remove(largest);
    
            // Print updated set
            System.out.println("After Removing First (" + smallest + ") and Last (" + largest + "): " + responseTimes);
        }
    }