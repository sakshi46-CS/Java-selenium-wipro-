package Day8;

import java.util.LinkedList;

public class Collection_linkedlist {
public static void main(String[] args) {
	LinkedList<String>fruits=new LinkedList<>();
	
	//Add elements
	fruits.add("Apple");
	fruits.add("Banana");
	fruits.add("Mango");
	fruits.add("orange");
	fruits.add("Grapes");
	
	System.out.println("Fruits:"+fruits);
	
	System.out.println("First fruit:"+fruits.getFirst());
	System.out.println("Last fruit:"+fruits.getLast());
	
	fruits.addFirst("Kiwi");
	// Remove elements
    fruits.remove("Banana");
    fruits.removeFirst();
    fruits.removeLast();
    

    // Print the updated list
    System.out.println("Updated Fruits: " + fruits);
	
}
}
