package Day11;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter1 {
    public static void main(String[] args) throws IOException {
        String content = "This is the content to write into the file.";
            FileWriter writer2 = new FileWriter("C:\\Users\\DELL\\Desktop\\file\\Files.txt");
            writer2.write(content);
            writer2.close(); 
            System.out.println("File written successfully.");
      
    }
}
