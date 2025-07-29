package Day8;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Key: Student name, Value: Marks
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Sakshi", 88);
        marks.put("Amit", 76);
        marks.put("Neha", 92);

        // Print all entries
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Access specific student's marks
        System.out.println("Sakshi's marks: " + marks.get("Sakshi"));
    }
}
