package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection2 {
public static void main(String[] args) {
	ArrayList<Integer>a=new ArrayList<>(Arrays.asList(5777,9877,3456,9875));
	a.add(6543);
	a.add(1234);
	System.out.println(a);
	Collections.sort(a);
	int b=Collections.binarySearch(a, 9877);
	System.out.println(b);
	Collections.reverse(a);
	System.out.println(a);
}
}
