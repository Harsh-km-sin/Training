/*Enumerated
Explanation, its usage and example
Edited by Harsh Kr Singh - 02/10/2024.
 */

/*enums are special data types that represent a fixed set of constants.
They are used when you have predefined values that do not change,
such as the days of the week, directions, or states.*/

// Define an Enum
enum Day {
    MONDAY("Start of Workweek"),
    TUESDAY("Second Day"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost Friday"),
    FRIDAY("End of Workweek"),
    SATURDAY("Weekend"),
    SUNDAY("Rest Day");

    // Field for additional information
    private String description;

    // Constructor
    Day(String description) {
        this.description = description;
    }

    // Getter for the description
    public String getDescription() {
        return description;
    }

    // Example of a custom method
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

// Another Enum implementing an Interface
interface Printable {
    void printDetails();
}

enum TrafficLight implements Printable {
    RED, YELLOW, GREEN;

    @Override
    public void printDetails() {
        switch (this) {
            case RED:
                System.out.println("Red: Stop!");
                break;
            case YELLOW:
                System.out.println("Yellow: Ready to move.");
                break;
            case GREEN:
                System.out.println("Green: Go!");
                break;
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Enum with Description
        System.out.println("Days of the Week:");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription() + " (Weekend? " + day.isWeekend() + ")");
        }

        // Enum with Interface Implementation
        System.out.println("\nTraffic Light States:");
        for (TrafficLight light : TrafficLight.values()) {
            light.printDetails();
        }
    }
}
