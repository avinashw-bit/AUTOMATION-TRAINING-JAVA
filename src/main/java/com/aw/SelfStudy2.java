package com.aw;

public class SelfStudy2 {

        public static void main(String[] args) {
            // contains() example
            String sentence = "I am learning Selenium for automation testing.";
            if (sentence.contains("Selenium")) {
                System.out.println("✅ The sentence contains the word 'Selenium'.");
            } else {
                System.out.println("❌ The word 'Selenium' is not found.");
            }
    
            // split() example
            String csvBrowsers = "Chrome,Firefox,Edge";
            String[] browsers = csvBrowsers.split(",");
            System.out.println("🧭 Browsers from CSV:");
            for (String browser : browsers) {
                System.out.println("- " + browser);
            }
    
            // substring() example
            String jobTitle = "Java Automation Engineer";
            String extracted = jobTitle.substring(5, 15); // "Automation"
            System.out.println("🔍 Extracted word using substring: " + extracted);
        }
    }
    
