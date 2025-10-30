// File: AbstractionDemo.java
package com.aw;

// Abstract class
abstract class Browser {
    abstract void launch();
}

// Subclass 1
class ChromeBrowser extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Chrome Browser...");
    }
}

// Subclass 2
class FirefoxBrowser extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Firefox Browser...");
    }
}

// Interface
interface WebActions {
    void click();
    void sendKeys(String input);
}

// Implementation class
class WebDriverActions implements WebActions {
    @Override
    public void click() {
        System.out.println("Element clicked.");
    }

    @Override
    public void sendKeys(String input) {
        System.out.println("Input sent: " + input);
    }
}

// Main class to test everything
public class SelfStudy9 {
    public static void main(String[] args) {
        Browser chrome = new ChromeBrowser();
        Browser firefox = new FirefoxBrowser();
        chrome.launch();
        firefox.launch();

        WebActions actions = new WebDriverActions();
        actions.click();
        actions.sendKeys("Hello Selenium!");
    }
}