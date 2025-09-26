package com.aw;

public class MultiplicationTableCutOff {

    public static void main(String[] args) {
        int number = 3;

        for (int i = 1; i <= 10; i++) {
            int result = number * i;

            // Stop when result goes above 15
            if (result > 15) {
                break;
            }

            System.out.println(number + " x " + i + " = " + result);
        }
    }
}