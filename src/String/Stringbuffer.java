package String;

public class Stringbuffer {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(6, " ");
        sb.replace(0, 5, "Hi");
        sb.reverse();
        System.out.println("Result: " + sb);
    }

}
