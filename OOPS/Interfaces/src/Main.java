/*Interfaces
Explanation, its usage and example
Edited by Harsh Kr Singh - 02/10/2024.
 */

/*It is a collection of abstract methods (methods without a body) and constants.
A class implements an interface to inherit its behavior.
Interfaces are used to achieve abstraction and multiple inheritance in Java*/

// Define an interface
interface Vehicle {
    void start(); // Abstract method
    void stop();  // Abstract method

    // Default method
    default void displayType() {
        System.out.println("Generic Vehicle");
    }
}

// Another interface
interface Electric {
    void chargeBattery(); // Abstract method

    // Default method
    default void energySource() {
        System.out.println("Powered by electricity");
    }
}

// Implementing both interfaces in a class
class ElectricCar implements Vehicle, Electric {
    @Override
    public void start() {
        System.out.println("Electric Car starts silently");
    }

    @Override
    public void stop() {
        System.out.println("Electric Car stops using regenerative braking");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Electric Car battery is charging");
    }

    // Overriding a default method from the Vehicle interface
    @Override
    public void displayType() {
        System.out.println("This is an Electric Car");
    }
}

// Another class implementing only the Vehicle interface
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a kick or self-start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops using hand brakes");
    }
}

public class Main {
    public static void main(String[] args) {
        // Example with ElectricCar
        ElectricCar electricCar = new ElectricCar();
        System.out.println("ElectricCar Example:");
        electricCar.start();
        electricCar.stop();
        electricCar.chargeBattery();
        electricCar.displayType(); // Overridden default method
        electricCar.energySource(); // Default method from Electric interface

        // Example with Bike
        System.out.println("\nBike Example:");
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        bike.displayType(); // Default method from Vehicle interface
    }
}
