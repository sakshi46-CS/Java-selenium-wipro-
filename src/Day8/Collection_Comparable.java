package Day8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Collection_Comparable implements Comparable<Collection_Comparable> {
    String name;
    int age;

    // Constructor
    public Collection_Comparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // compareTo method (used for sorting)
    public int compareTo(Collection_Comparable other) {
        return this.age - other.age;  // Sort by age
    }

    // toString method for easy printing
    public String toString() {
        return name + " - " + age;
    }

    // main method to test sorting
    public static void main(String[] args) {
        List<Collection_Comparable> list = Arrays.asList(
            new Collection_Comparable("Sakshi", 25),
            new Collection_Comparable("Amit", 22),
            new Collection_Comparable("Neha", 28)
        );

        // Before sorting
        System.out.println("Before sorting: " + list);

        // Sort the list
        Collections.sort(list);

        // After sorting
        System.out.println("After sorting: " + list);
    }
}
