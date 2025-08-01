package Day11;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
public static void main(String[] args) throws IOException {
	try {
	FileWriter writer=new FileWriter("C:\\Users\\DELL\\Desktop\\file\\file.txt");
	writer.write("Today is mock assessment");
	writer.write("Hello java");
	writer.close();
	
	System.out.println("Data written successfully in file");
}  catch(IOException e) {
	System.out.println("An error occured");
	e.printStackTrace();
}
}
}

