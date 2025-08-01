package Day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_1 {
    public static void main(String[] args) {
        try {
            // Specify the file path
            FileWriter writer = new FileWriter("C:\\Users\\DELL\\Desktop\\file\\file.txt");

            // Wrap FileWriter with BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Write content to the file
            bufferedWriter.write("Hello, this is written using BufferedWriter!");
            bufferedWriter.newLine();  // Optional: adds a new line
            bufferedWriter.write("This is the second line.");

            // Always close the writer
            bufferedWriter.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
