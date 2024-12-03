/*Inheritance
Explanation, its usage and example
Edited by Harsh Kr Singh - 02/10/2024.
 */

/* inheritance is a mechanism that allows a class to inherit properties
and behaviors of its parent class or base class to its child class or subclass*/

// Parent Class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// Child Class 1: Single Inheritance
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Intermediate Class for Multilevel Inheritance
class ElectricCar extends Car {
    @Override
    void drive() {
        System.out.println("Electric Car is driving silently");
    }

    void chargeBattery() {
        System.out.println("Electric Car is charging");
    }
}

// Another Child Class: Hierarchical Inheritance
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick");
    }

    void ride() {
        System.out.println("Bike is riding");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Single Inheritance Example
        Car car = new Car();
        System.out.println("Single Inheritance:");
        car.start(); // From Vehicle
        car.drive(); // From Car

        // Multilevel Inheritance Example
        ElectricCar electricCar = new ElectricCar();
        System.out.println("\nMultilevel Inheritance:");
        electricCar.start(); // From Vehicle
        electricCar.drive(); // Overridden in ElectricCar
        electricCar.chargeBattery(); // From ElectricCar

        // Hierarchical Inheritance Example
        Bike bike = new Bike();
        System.out.println("\nHierarchical Inheritance:");
        bike.start(); // Overridden in Bike
        bike.ride();  // From Bike
    }
}
