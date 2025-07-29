package Day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collections_Treeset {
	public static void main(String[] args) {
		Set <Integer>setdata=new TreeSet();
		setdata.add(68);
		setdata.add(28);
		setdata.add(68);
		setdata.add(18);
		setdata.add(54);
		setdata.add(32);
		//setdata.add("Hello");
		System.out.println(setdata);
		Iterator i=setdata.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());//print one by one
		}
	}
}
