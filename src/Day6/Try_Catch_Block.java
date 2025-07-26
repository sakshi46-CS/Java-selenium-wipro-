package Day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_Catch_Block {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\DELL\\Desktop\\Hii.txt");

        try {
            // FileReader might throw FileNotFoundException
            BufferedReader bf = new BufferedReader(new FileReader(file));

            String line = bf.readLine();

            while (line != null) {
                System.out.println("File Content: " + line);
                line = bf.readLine(); // read next line
            }

            bf.close(); // always close the BufferedReader

        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
