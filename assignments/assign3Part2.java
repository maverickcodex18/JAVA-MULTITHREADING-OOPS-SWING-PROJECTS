import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class assign3Part2 {

    public static void main(String[] args) {
        // Create an ArrayList of Strings with at least 5 lines of text
        ArrayList<String> lines = new ArrayList<>();
        lines.add("This is the first line.");
        lines.add("Here is the second line.");
        lines.add("The third line is here.");
        lines.add("A fourth line appears.");
        lines.add("And here comes the fifth line.");

        // Specify the path to the output text file
        String filePath = "D:\\Java\\assignments\\output.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            // Write each line from the ArrayList to the file
            for (String line : lines) {
                bw.write(line);
                bw.newLine(); // Add a newline character after each line
            }
        } catch (IOException e) {
            // Handle file writing errors
            e.printStackTrace();
        }
    }
}
