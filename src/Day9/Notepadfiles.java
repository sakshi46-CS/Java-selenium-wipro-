package Day9;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Notepadfiles {
    public static void main(String[] args) {
        try {
            String filepath1 = "C:\\Users\\DELL\\Desktop\\file\\Files.txt";
            String filepath2 = "C:\\Users\\DELL\\Desktop\\file\\Files1.txt";

            List<String> file1Lines = Files.readAllLines(Paths.get(filepath1));
            List<String> file2Lines = Files.readAllLines(Paths.get(filepath2));

            if (file1Lines.equals(file2Lines)) {
                System.out.println("Files are same.");
            } else {
                System.out.println("Files are different.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
