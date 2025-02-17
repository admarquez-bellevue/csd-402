// Adrian Marquez
// Module 9.2
// 02/16/2025

// This program creates an ArrayList of strings, prints its contents using a for-each loop, 
// then prompts the user to input an index to display an element, handling invalid index inputs with exception handling.
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        // Creating an ArrayList filled with Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Luke");
        stringList.add("Leia");
        stringList.add("Han");
        stringList.add("Obi-Wan");
        stringList.add("Darth Vader");
        stringList.add("Yoda");
        stringList.add("Palpatine");
        stringList.add("Chewbacca");
        stringList.add("R2-D2");
        stringList.add("C-3PO");

        // Using for-each loop to print the ArrayList
        System.out.println("ArrayList contents:");
        for (String movie : stringList) {
            System.out.println(movie);
        }

        // Asking the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you'd like to see again (0-9): ");
        int index = scanner.nextInt();

        // Attempting to print the element with exception handling
        try {
            System.out.println("Element at index " + index + ": " + stringList.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}
