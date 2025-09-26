package com.aw;

public class SkipMultiplesOf3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                continue; // Skip multiples of 3
            }
            System.out.println(i);
        }
    }
}

