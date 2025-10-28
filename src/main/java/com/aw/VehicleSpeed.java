package com.aw;

class Vehicle {
    void speed() {
        System.out.println("Generic vehicle speed");
    }
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car speed: 100 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike speed: 60 km/h");
    }
}

public class VehicleSpeed {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike() };

        for (Vehicle v : vehicles) {
            v.speed();  // Calls overridden method based on actual object type
        }
    }
}

