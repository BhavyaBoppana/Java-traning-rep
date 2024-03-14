import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileReader;
import java.io.IOException;

public class CountStringFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bhavy\\Downloads\\input.txt"; // Path to the file
        String searchString = "Java"; // String to search for
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into words using space as delimiter
                String[] words = line.split(" ");
                // Check each word in the line
                for (String word : words) {
                    // If the word matches the search string, increment the count
                    if (word.equals(searchString)) {
                        count++;
                    }
                }
            }
            // Print the count of occurrences of the search string
            System.out.println("The count of '" + searchString + "' in the file is: " + count);
        } catch (IOException e) {
            // Handle IO exception
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

