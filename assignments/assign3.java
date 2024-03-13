import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class assign3 {


public class FileReadingExample {
    public static void main(String[] args) {
        // Specify the path to the text file
        String filePath = "D:\\Java\\assignments\\input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file and display it
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle file reading errors
            e.printStackTrace();
        }
    }
}

}
