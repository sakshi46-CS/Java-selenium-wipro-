package Day3;

public class Upi extends Bank {
	public Upi(double amount) {
		super(amount);
		
		
	}

	@Override
	public void makePayment() {
	System.out.println("Processing Upi Payment");
	printReceipt();
		
	}
   
}
