package Day8;

	import java.util.LinkedList;

	class Student {
	    String name;
	    int rollNo;

	    Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    public String toString() {
	        return name + " (Roll No: " + rollNo + ")";
	    }
	}

	public class LinkedListCustomExample {
	    public static void main(String[] args) {
	        LinkedList<Student> students = new LinkedList<>();

	        students.add(new Student("Sakshi", 101));
	        students.add(new Student("Amit", 102));
	        students.add(new Student("Neha", 103));

	        System.out.println("Student List:");
	        for (Student s : students) {
	            System.out.println(s);
	        }
	    }

}
