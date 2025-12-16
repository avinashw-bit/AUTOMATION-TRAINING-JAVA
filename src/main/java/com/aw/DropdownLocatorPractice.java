package com.aw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Assignment C - Dropdown Locator Practice
 * Using the "Dropdown Example" section:
 * 1. Select Option1 using ID
 * 2. Select Option2 using Visible Text
 * 3. Select Option3 using Index
 */
public class DropdownLocatorPractice {
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";

    public void execute(WebDriver driver) {
        System.out.println("=== Assignment C - Dropdown Locator Practice ===");

        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);

        try {
            Thread.sleep(2000); // Wait for page to load

            // Locate the dropdown using ID
            WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
            Select select = new Select(dropdown);

            // 1. Select Option1 using value attribute
            select.selectByValue("option1");
            System.out.println("✓ Option1 selected (dropdown located by ID, option selected by value)");
            Thread.sleep(1000);

            String selectedOption1 = select.getFirstSelectedOption().getText();
            System.out.println("Currently selected: " + selectedOption1);

            // 2. Select Option2 using Visible Text
            select.selectByVisibleText("Option2");
            System.out.println("✓ Option2 selected using Visible Text");
            Thread.sleep(1000);

            String selectedOption2 = select.getFirstSelectedOption().getText();
            System.out.println("Currently selected: " + selectedOption2);

            // 3. Select Option3 using Index
            // Index starts from 0, first option is "Select" at index 0
            select.selectByIndex(3);
            System.out.println("✓ Option3 selected using Index (3)");
            Thread.sleep(1000);

            String selectedOption3 = select.getFirstSelectedOption().getText();
            System.out.println("Currently selected: " + selectedOption3);

            System.out.println("\n=== Assignment C Completed ===\n");
            Thread.sleep(3000); // Keep browser open to see results

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getAssignmentName() {
        return "Assignment C - Dropdown Locator Practice";
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            DropdownLocatorPractice assignment = new DropdownLocatorPractice(); // ✅ Fixed class name
            assignment.execute(driver);
        } finally {
            try {
                Thread.sleep(5000); // Keep browser open for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}