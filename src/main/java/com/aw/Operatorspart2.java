package com.aw;
public class Operatorspart2 {

    static int a = 10;
    static int b = 20;
    static int x = 5;
    static int y = 10;
    static boolean haspen = true;
    static boolean hasnotebook = false;
    static int num = 10;
    static int num2 = 20;

    public static void main(String[] args) {
        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relational Operators
        System.out.println("Relational Operators");
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y); // true

        // Logical Operators
        System.out.println("Logical Operators");
        System.out.println(haspen && hasnotebook);
        System.out.println(haspen || hasnotebook);
        System.out.println(!haspen);
        System.out.println(!hasnotebook);

        // Assignment Operators
        System.out.println("Assignment Operators");
        System.out.println(num = num2);
        System.out.println(num += num2);
        System.out.println(num -= num2);
        System.out.println(num *= num2);
        System.out.println(num /= num2);
        System.out.println(num %= num2);    

        //ternary operator
        System.out.println("Ternary Operator");
        int age = 18;
        String result = age >= 18 ? "Adult" : "Minor";
        System.out.println(result);


   
    }
}
