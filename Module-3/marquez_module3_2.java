public class marquez_module3_2 {
    public static void main(String[] args) {
        int rows = 7;

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the increasing sequence
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2; 
            }

            // Print the decreasing sequence
            value /= 2; 
            for (int j = i - 1; j >= 0; j--) {
                value /= 2; 
                System.out.print(value + " ");
            }

            System.out.println("@");
            System.out.println();
        }
    }
}
