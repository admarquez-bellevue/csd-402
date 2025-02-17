// Adrian Marquez
// 02/16/2025
// Module 8.2

// This program reads integers from the user until '0' is entered, and then returns the largest integer.
import java.util.ArrayList;
import java.util.Scanner;

public class AdrianArrayListTest {
    
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        int maxValue = list.get(0);
        for (int num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter integers (enter 0 to stop):");
        
        while (true) {
            int num = scanner.nextInt();
            numbers.add(num);
            if (num == 0) {
                break;
            }
        }
        
        Integer maxNumber = max(numbers);
        System.out.println("The largest number in the list is: " + maxNumber);
        
        scanner.close();
    }
}
