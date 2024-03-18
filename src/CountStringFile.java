import java.io.*;
public class CountStringFile {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\bhavy\\Downloads\\input.txt"; // Path to the file
        String searchString = "Java"; // String to search for
        int count = 0;
        String line; //store each line read from the file
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.equals(searchString)) {
                    count++;
                }
            }
        }
            System.out.print("The count of '" + searchString + "' in the file is: " + count);
    }
}

