package project;

import java.util.Arrays;

interface Namesorter{
	void sort(String[] names);
}

class Builtinsorter implements Namesorter{

	@Override
	public void sort(String[] names) {
		System.out.println("Original names");
		for(String name:names) {
			System.out.println(name);
		}
		Arrays.sort(names,String.CASE_INSENSITIVE_ORDER);
		 System.out.println("\n Sorted names:");
	        for (String name : names) {
	            System.out.println(name);
	        }
		
	}
	
}
public class Sortingarray {
	public static void main(String[] args) {
        String[] employees = { "Neha", "amit", "Pooja", "Ravi", "sakshi" };

        Namesorter sorter = new Builtinsorter();
        sorter.sort(employees);
    }
}
