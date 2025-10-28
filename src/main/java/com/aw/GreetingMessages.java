package com.aw;
public class GreetingMessages {
        // No-argument method
        public void sayHello() {
            System.out.println("Hello there!");
        }
    
        // Method with one String argument
        public void sayHello(String name) {
            System.out.println("Hello, " + name + "!");
        }
    
        // Method with String and int arguments
        public void sayHello(String name, int age) {
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        }
    
        public static void main(String[] args) {
            GreetingMessages greeter = new GreetingMessages();
    
            greeter.sayHello();                         // Calls sayHello()
            greeter.sayHello("Avinash");                // Calls sayHello(String)
            greeter.sayHello("Avinash", 25);            // Calls sayHello(String, int)
        }
    }
    

