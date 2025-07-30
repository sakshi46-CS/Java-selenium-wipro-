package Day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class students{
	private String name;
	private int age;
	public students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
public class Serializableanddeserializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		students s1=new students();
		
		s1.setName("Suresh");
		s1.setAge(25);
		
		FileOutputStream out=new FileOutputStream("C:\\Users\\DELL\\Desktop\\file\\file.txt");
		ObjectOutputStream output=new ObjectOutputStream(out);
		output.writeObject(s1);
		out.close();
		output.close();
		
		FileInputStream in=new FileInputStream("C:\\Users\\DELL\\Desktop\\file\\file.txt");
		ObjectInputStream input=new ObjectInputStream(in);
		students s2=(students) input.readObject();
		
		
	}
}


