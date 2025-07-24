package Day4;


interface calculator{
	double add(double a,double b);
}
public class lambdaCalculatorprogram {
	
	public static void main(String[] args) {
		calculator addition=(a,b)->{
			System.out.println("Performing addition");
			double result=a+b;
			System.out.println(result);
			return result;
			
		};
		calculator subtract=(a,b)->a-b;
		double a=1000,b=2000;
		addition.add(a, b);
		System.out.println("subtract"+subtract.add(a,b));
			
		};
		//Syntax for lamda expression in java is (Parameters list)->body
		
		
	}
