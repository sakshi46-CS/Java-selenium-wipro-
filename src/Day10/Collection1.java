package Day10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Collection1 {
public static void main(String[] args) {
	ArrayList<String>courses=new ArrayList<>();
	courses.add("Java");
	courses.add("Python");
	courses.add("Selenium");
	
	for(String c:courses) {
		System.out.println(c);
	}
	Set<Integer>courseID=new HashSet<>();
	courseID.add(101);
	courseID.add(102);
	courseID.add(101);
	
	for(Integer j:courseID) {
		System.out.println(j);
	}
	HashMap<String, Integer>coursedata=new HashMap<>();
	coursedata.put("Java", 101);
	coursedata.put("Java", 102);
	coursedata.put("cloudcomputing", 101);
	coursedata.put("selenium", 104);
	
	for(String c:coursedata.keySet()) {
		System.out.println(c+"="+coursedata.get(c));
	}
	
}
}
