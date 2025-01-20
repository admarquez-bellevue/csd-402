/*  Adrian Marquez  */
/*  Module 2.2  */
/*  01/19/25   */


 import java.util.Scanner;
 import java.util.Random;
 
 public class marquez_2_2 {
     public static void main(String[] args) {
         // Create objects for user input and random number generation
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
 
         // Generate the computer's choice (1, 2, or 3)
         int computerChoice = random.nextInt(3) + 1;
 
         // Prompt the user for their choice
         System.out.println("Welcome to Rock-Paper-Scissors!");
         System.out.println("Enter your choice:");
         System.out.println("1: Rock");
         System.out.println("2: Paper");
         System.out.println("3: Scissors");
 
         int userChoice = scanner.nextInt();
 
         // Validate user input
         if (userChoice < 1 || userChoice > 3) {
             System.out.println("Invalid choice. Please restart the game and choose 1, 2, or 3.");
         } else {
             // Display choices
             System.out.println("You chose: " + choiceToString(userChoice));
             System.out.println("Computer chose: " + choiceToString(computerChoice));
 
             // Determine the result
             String result = determineWinner(userChoice, computerChoice);
 
             // Display the result
             System.out.println(result);
         }
 
         // Close the scanner
         scanner.close();
     }
 
     // Helper method to convert numeric choice to string
     private static String choiceToString(int choice) {
         switch (choice) {
             case 1:
                 return "Rock";
             case 2:
                 return "Paper";
             case 3:
                 return "Scissors";
             default:
                 return "Unknown";
         }
     }
 
     // Helper method to determine the winner
     private static String determineWinner(int userChoice, int computerChoice) {
         if (userChoice == computerChoice) {
             return "It's a tie!";
         } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
             return "You win!";
         } else {
             return "Computer wins!";
         }
     }
 }