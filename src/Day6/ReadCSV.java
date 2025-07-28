package Day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\DELL\\Desktop\\mydata.csv";

        try {
        	
            // Open file for reading
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line = br.readLine();

            while (line != null) {
                System.out.println("File content: " + line);
                line = br.readLine();
            }

            br.close();  // Close file after reading

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        }
    }
}
