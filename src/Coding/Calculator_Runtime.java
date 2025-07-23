package Coding;

public class Calculator_Runtime {
		    public int add(int a, int b) {
		        return a + b;
		    }
		    public static void main(String[] args) {
		    	Calculator_Runtime calc = new Calculator_Runtime();
		        int sum = calc.add(3, 4);
		        System.out.println("Sum = " + sum);
		    }
		}
