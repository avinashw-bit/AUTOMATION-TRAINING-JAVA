package com.aw;

public class DriverStartCar {

    // Parent class
    static class Driver {
        void startCar() {
            System.out.println("Starting a generic car...");
        }
    }

    // Subclass 1
    static class ChromeDriver extends Driver {
        @Override
        void startCar() {
            System.out.println("Starting Chrome browser for automation...");
        }
    }

    // Subclass 2
    static class FirefoxDriver extends Driver {
        @Override
        void startCar() {
            System.out.println("Starting Firefox browser for automation...");
        }
    }

    // Main method
    public static void main(String[] args) {
        Driver driver;

        driver = new ChromeDriver();   // Reference type is Driver
        driver.startCar();             // Calls ChromeDriver's version

        driver = new FirefoxDriver();  // Reference type still Driver
        driver.startCar();             // Calls FirefoxDriver's version
    }
}
