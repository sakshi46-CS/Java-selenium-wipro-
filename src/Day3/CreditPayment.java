package Day3;

public class CreditPayment extends Bank {
   public CreditPayment(double amount) {
	   super(amount);
   }

@Override
public void makePayment() {
System.out.println("Processing credit card payment");
printReceipt();
	
}
   
}
