package Day4;

public class StringFunction {
public static void main(String[] args) {
	String str="I am an employee of ITC";
	System.out.println("Length of the string");
	str.length();
	str.charAt(5);
	String substr=str.substring(3,9);
	// 4. toLowerCase()11111
    System.out.println("String in lowercase: " + str.toLowerCase()); 
    // 5. toUpperCase()
    System.out.println("String in uppercase: " + str.toUpperCase());
    // 6. equals() - Compare two strings
    String anotherStr = "I am an employee of ITC";
    System.out.println("Strings are equal: " + str.trim().equals(anotherStr));
    // 7. equalsIgnoreCase()
    System.out.println("Strings are equal (ignore case): " + str.equalsIgnoreCase("   i am an employee of itc   ")); 
    // 8. trim() - Remove leading and trailing spaces
    System.out.println("Trimmed string: '" + str.trim() + "'"); 
    // 9. replace() - Replace a character
    System.out.println("Replace 'a' with 'A': " + str.replace('a', 'A'));
    // 10. contains() - Check if the string contains a substring
    System.out.println("Contains 'employee': " + str.contains("employee")); 
    // 11. indexOf() - Find the index of a substring
    System.out.println("Index of 'employee': " + str.indexOf("employee"));
    // 12. split() - Split the string into parts
    String[] words = str.trim().split(" ");
    System.out.println("Words in the string:");
    for (String word : words) {
        System.out.println(word);
    }
   
    // 13. startsWith() - Check if string starts with a prefix
    System.out.println("Starts with 'I am': " + str.startsWith("I am"));
    // 14. endsWith() - Check if string ends with a suffix
    System.out.println("Ends with 'ITC': " + str.endsWith("ITC")); 
    // 15. valueOf() - Convert other types to String
    int number = 456;
    String numberStr = String.valueOf(number);
    System.out.println("String value of number: " + numberStr); 
}
}
