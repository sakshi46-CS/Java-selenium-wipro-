package Day6;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadXML {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\DELL\\Desktop\\employees.xml";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();

            while (line != null) {
                System.out.println("Line: " + line.trim());
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading XML: " + e.getMessage());
        }
    }
}

