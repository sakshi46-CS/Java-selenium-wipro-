package Day6;

import java.io.FileWriter;
import java.io.IOException;

public class Writecsv {
public static void main(String[] args) {
	String filepath="C:\\Users\\DELL\\Desktop\\writedata.csv";
	try {
		FileWriter writer=new FileWriter(filepath);
		
		//write headers
		
		writer.append("ID,Name,Age,Department,Salary\n");
		
		//write data rows
		writer.append("101,sakshi,22,HR,5000\n");
		 writer.append("102,Omkar,30,IT,75000\n");
         writer.append("103,Ketan,29,Finance,68000\n");

         writer.close();

         System.out.println("CSV file written successfully!");

     } catch (IOException e) {
         System.out.println("Error writing CSV: " + e.getMessage());
		
	}
}
}
