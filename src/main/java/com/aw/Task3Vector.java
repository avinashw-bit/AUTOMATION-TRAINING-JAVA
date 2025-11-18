package com.aw;
import java.util.Vector;
import java.util.Enumeration;


public class Task3Vector {

    public static void main(String[] args) {
        // 1. Create a Vector<Integer> to store response codes
        Vector<Integer> responseCodes = new Vector<>();

        // 2. Add elements
        responseCodes.add(200);
        responseCodes.add(404);
        responseCodes.add(500);
        responseCodes.add(302);

        // Print using Enumeration
        System.out.println("Initial Response Codes:");
        Enumeration<Integer> codesEnum = responseCodes.elements();
        while (codesEnum.hasMoreElements()) {
            System.out.println(codesEnum.nextElement());
        }

        // 3. Add and remove some values
        responseCodes.add(403); // Add new code
        responseCodes.remove(Integer.valueOf(500)); // Remove specific code

        // Observe the updated order
        System.out.println("\nUpdated Response Codes:");
        for (Integer code : responseCodes) {
            System.out.println(code);
        }
    }
}

