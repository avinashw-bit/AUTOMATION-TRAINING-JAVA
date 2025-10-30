package com.aw;
import java.util.Scanner;
public class SelfStudy1 {
   
    public static void main(String[] args) {
        // Step 1: Take user's name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Step 2: Reverse the name using StringBuilder
        StringBuilder sb = new StringBuilder(userName);
        String reversedName = sb.reverse().toString();

        // Step 3: Append welcome message using StringBuffer
        StringBuffer finalMessage = new StringBuffer();
        finalMessage.append(reversedName);
        finalMessage.append(" - Welcome to Automation Training");

    
        System.out.println(finalMessage.toString());

        scanner.close();
    }
}

