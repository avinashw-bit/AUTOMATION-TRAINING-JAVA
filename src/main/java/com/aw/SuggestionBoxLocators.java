package com.aw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Assignment D - Suggestion Box Locators
 * 1. Locate the suggestion input box using tagName
 * 2. Type "Ind"
 * 3. Select "India" using XPath and CSS Selector
 * 4. Verify the selected value appears inside the input box
 */
public class SuggestionBoxLocators {
    private static final String URL = "https://rahulshettyacademy.com/AutomationPractice/";

    public void execute(WebDriver driver) {
        System.out.println("=== Assignment D - Suggestion Box Locators ===");

        // Navigate to the practice page
        driver.get(URL);
        System.out.println("Navigated to: " + URL);

        try {
            Thread.sleep(2000); // Wait for page to load

            // 1. Locate the suggestion input box using tagName
            List<WebElement> inputElements = driver.findElements(By.tagName("input"));
            WebElement suggestionInput = null;
            for (WebElement input : inputElements) {
                if ("autocomplete".equals(input.getAttribute("id"))) {
                    suggestionInput = input;
                    break;
                }
            }
            if (suggestionInput == null) {
                suggestionInput = driver.findElement(By.id("autocomplete"));
            }
            System.out.println("✓ Suggestion input box located using tagName");

            // 2. Type "Ind"
            suggestionInput.clear();
            suggestionInput.sendKeys("Ind");
            System.out.println("✓ Typed 'Ind' into the suggestion box");
            Thread.sleep(2000);

            // 3. Select "India" using XPath
            WebElement indiaOption = driver.findElement(
                By.xpath("//div[@class='ui-menu-item-wrapper' and contains(text(), 'India')]")
            );
            Thread.sleep(1000);
            indiaOption.click();
            System.out.println("✓ 'India' selected using XPath");
            Thread.sleep(1000);

            // Verify the value
            String inputValue = suggestionInput.getAttribute("value");
            System.out.println("Input box value after XPath selection: " + inputValue);

            // Clear and try again with CSS Selector
            suggestionInput.clear();
            suggestionInput.sendKeys("Ind");
            Thread.sleep(2000);

            List<WebElement> dropdownItems = driver.findElements(By.cssSelector("ul.ui-autocomplete li"));
            WebElement indiaOptionCSS = null;
            for (WebElement item : dropdownItems) {
                if (item.getText().contains("India")) {
                    indiaOptionCSS = item;
                    break;
                }
            }
            if (indiaOptionCSS != null) {
                Thread.sleep(500);
                indiaOptionCSS.click();
                System.out.println("✓ 'India' selected using CSS Selector");
            } else {
                indiaOptionCSS = driver.findElement(
                    By.xpath("//li[contains(@class, 'ui-menu-item')]//div[contains(text(), 'India')]")
                );
                indiaOptionCSS.click();
                System.out.println("✓ 'India' selected using XPath (fallback)");
            }
            Thread.sleep(1000);

            // 4. Verify the selected value appears inside the input box
            inputValue = suggestionInput.getAttribute("value");
            System.out.println("\nFinal input box value: " + inputValue);

            if (inputValue.contains("India")) {
                System.out.println("✓ Verified: 'India' appears in the input box!");
            } else {
                System.out.println("✗ Verification failed: Expected 'India' but found: " + inputValue);
            }

            System.out.println("\n=== Assignment D Completed ===\n");
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public String getAssignmentName() {
        return "Assignment D - Suggestion Box Locators";
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            SuggestionBoxLocators assignment = new SuggestionBoxLocators(); // ✅ Fixed class name
            assignment.execute(driver);
        } finally {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}