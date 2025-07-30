package Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_1 
{
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter a number");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader reader=new BufferedReader(isr);
		int a=Integer.parseInt(reader.readLine());
		System.out.println(a);
		
		
		reader.close();
		isr.close();
		
	}
}
