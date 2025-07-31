package Day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stud implements Serializable {
    private String name;
    private int age;

    public Stud(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

// Main class to perform serialization
public class Serialization {
    public static void main(String[] args) {
        try {
            // Create and modify student object
            Stud s1 = new Stud("sakshi", 45);
            s1.setName("girish");
            s1.setAge(56);

            // Serialize the object to file
            FileOutputStream out = new FileOutputStream("C:\\Users\\DELL\\Desktop\\Hii.txt");
            ObjectOutputStream output = new ObjectOutputStream(out);

            output.writeObject(s1); // Write object to file

            output.close();
            out.close();

            System.out.println("Object serialized successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
