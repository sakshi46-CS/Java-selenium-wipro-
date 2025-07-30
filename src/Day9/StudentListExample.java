package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Student class with constructor and toString
 class Student implements Comparable<Student>{
    String name;
    int age;

    // Constructor to initialize name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
  public int compareTo(Student other) {
	  return Integer.compare(this.age, other.age);
  }
    // toString method for easy printing
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class StudentListExample { // ✅ Changed class name from Comparable to avoid conflict
    public static void main(String[] args) {
    	Comparator<Student>com=new Comparator<Student>() {

			@Override
			public int compare(Student i, Student j) {
				if(i.age>j.age) 
					return 1;
				else
					return-1;
			}
    		
    	};
        List<Student> stud = new ArrayList<>();

        // ✅ Add students using the constructor
        stud.add(new Student("Sadghh", 56));
        stud.add(new Student("Ravi", 23));
        stud.add(new Student("Anjali", 30));
        Collections.sort(stud,com);

        // Print the list of students
        System.out.println(stud);
        for(Student i:stud) {
        	System.out.println(i);
        }
    }
}
