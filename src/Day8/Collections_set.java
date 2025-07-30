package Day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_set {
public static void main(String[] args) {
	Set <Integer>setdata=new HashSet();
	setdata.add(68);
	setdata.add(28);
	setdata.add(68);
	//setdata.add("Hello");
	System.out.println(setdata);
	Iterator i=setdata.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());//print one by one
	}
}
}
