package Day10;

import java.io.FileWriter;
import java.io.IOException;

public class Writetosimplefile1 {
public static void main(String[] args) {
	try {
		FileWriter writer=new FileWriter("C:\\Users\\DELL\\Desktop\\file\\file.txt");
		writer.write("Hello,I am trying to find testing tools for ITC Project\n");
		writer.write("Tools like automation and performance tools\n");
		
		writer.close();
		
		System.out.println("Data written successfully in file");
	}catch(IOException e) {
		System.out.println("An error occured");
		e.printStackTrace();
	}
}
}
