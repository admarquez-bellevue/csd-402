// Adrian Marquez
// Module 9.3
// 02/16/2025

// This program creates a file if it doesn't exist, appends 10 random integers to it, 
// and then reads and displays the contents of the file.

import java.io.*;
import java.util.Random;

public class FileWriting {
    public static void main(String[] args) {
        String fileName = "data.file";
        File file = new File(fileName);
        Random random = new Random();

        try {
            // If the file doesn't exist, create it
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + fileName);
            }

            // Writing 10 random integers to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)); 
            for (int i = 0; i < 10; i++) {
                int randomNum = random.nextInt(100); 
                writer.write(randomNum + (i < 9 ? ", " : ""));
            }
            writer.newLine(); 
            writer.close(); 

            // Reading and displaying the file content
            BufferedReader reader = new BufferedReader(new FileReader(file));
            System.out.println("Contents of the file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close(); 

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
