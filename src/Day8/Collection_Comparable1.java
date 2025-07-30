package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Comparable1 {
    public static void main(String[] args) {
        // Custom Comparator to sort based on last digit
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                // If last digits are same, return 0
                if (i % 10 > j % 10)
                    return 1;
                else if (i % 10 < j % 10)
                    return -1;
                else
                    return 0;
            }
        };

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(90);
        numbers.add(5);

        System.out.println("Before sorting: " + numbers);

        Collections.sort(numbers, c);

        System.out.println("After sorting by last digit: " + numbers);
    }
}
