package Day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
public static void main(String[] args) throws IOException {
	FileReader reader=new FileReader("C:\\Users\\DELL\\Desktop\\file\\file1.txt");
    int ch;
    while((ch=reader.read())!=-1) {
    	System.out.println((char)ch);
    }
    reader.close();
}
}
