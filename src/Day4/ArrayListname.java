package Day4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListname {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


