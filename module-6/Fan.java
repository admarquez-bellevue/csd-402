// Adrian Marquez
// 02/09/2025
// Module 6.2

// This program demonstrates how to work with constants, fields, constructors, getters and setters, and object states in Java.

public class Fan {
    
    // Constants for Fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor with default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with arguments to set custom values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and setter methods for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and setter methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and setter methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to return the fan's state
    @Override
    public String toString() {
        if (on) {
            return "Fan is on with speed " + speed + ", radius " + radius + ", and color " + color;
        } else {
            return "Fan is off with radius " + radius + " and color " + color;
        }
    }

    // Main method to test the Fan class
    public static void main(String[] args) {
        // Create two instances of the Fan class
        Fan fan1 = new Fan(); // Using default constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue"); // Using argument constructor

        // Display the initial state of the fans
        System.out.println("Fan 1 (using default constructor): " + fan1);
        System.out.println("Fan 2 (using argument constructor): " + fan2);

        // Modify fan1 and display the updated state
        fan1.setSpeed(SLOW);
        fan1.setOn(true);
        fan1.setColor("green");
        System.out.println("Fan 1 after modification: " + fan1);

        // Modify fan2 and display the updated state
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(8);
        fan2.setColor("red");
        fan2.setOn(false);
        System.out.println("Fan 2 after modification: " + fan2);
    }
}
