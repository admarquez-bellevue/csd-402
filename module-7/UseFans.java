// Adrian Marquez
// Module 7.2
// 02/09/2025

// This program creates a collection of fan instances and displays them.

import java.util.ArrayList;
import java.util.List;

public class UseFans {
    
    // Method to display a single Fan instance without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Fan Details:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + (fan.isOn() ? "Yes" : "No"));
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("-----------------------");
    }

    // Method to display a collection of Fan instances without using toString()
    public static void displayFans(List<Fan> fans) {
        System.out.println("Displaying All Fans:");
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating a collection of Fan instances
        List<Fan> fanCollection = new ArrayList<>();
        
        // Adding different Fan instances
        fanCollection.add(new Fan()); // Default constructor
        fanCollection.add(new Fan(Fan.FAST, true, 10, "blue"));
        fanCollection.add(new Fan(Fan.MEDIUM, false, 8, "red"));
        fanCollection.add(new Fan(Fan.SLOW, true, 7.5, "yellow"));

        // Display a single fan (first fan in the collection)
        System.out.println("Displaying a single Fan:");
        displayFan(fanCollection.get(1));

        // Display all fans in the collection
        displayFans(fanCollection);
    }
}
