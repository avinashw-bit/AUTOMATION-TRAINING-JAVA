package com.aw;

public class SelfStudy4 {

        public static void main(String[] args) {
            // Part 1: One-Dimensional Array
            int[] numbers = {10, 20, 30, 40, 50};
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("🔢 Sum of 1D array: " + sum);
    
            // Part 2: Multi-Dimensional Array (3x3)
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            System.out.println("📊 Elements of 2D array:");
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println(); // Move to next line after each row
            }
        }
    }
    
