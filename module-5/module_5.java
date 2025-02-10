// Adrian Marquez
// Module 5.2
// 02/09/2025

// Finds the location of the largest and smallest elements in 2D arrays (int and double).

public class module_5 {

    // Method to locate the largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double largest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int largest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double smallest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int smallest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        // Test with a 2D double array
        double[][] doubleArray = {
            {3.5, 5.6, 1.2},
            {8.7, 2.4, 6.1},
            {4.8, 9.0, 7.3}
        };
        int[] largestLocationDouble = locateLargest(doubleArray);
        System.out.println("Largest element in double array is at: [" + largestLocationDouble[0] + "][" + largestLocationDouble[1] + "]");
        int[] smallestLocationDouble = locateSmallest(doubleArray);
        System.out.println("Smallest element in double array is at: [" + smallestLocationDouble[0] + "][" + smallestLocationDouble[1] + "]");

        // Test with a 2D int array
        int[][] intArray = {
            {3, 5, 1},
            {8, 2, 6},
            {4, 9, 7}
        };
        int[] largestLocationInt = locateLargest(intArray);
        System.out.println("Largest element in int array is at: [" + largestLocationInt[0] + "][" + largestLocationInt[1] + "]");
        int[] smallestLocationInt = locateSmallest(intArray);
        System.out.println("Smallest element in int array is at: [" + smallestLocationInt[0] + "][" + smallestLocationInt[1] + "]");
    }
}
