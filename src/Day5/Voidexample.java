package Day5;


class ReceiptPrinter{
	void printreceipt(String name,double amount) {
		 System.out.println("Customer: " + name);
	        System.out.println("Amount Paid: $" + amount);
	}
}
public class Voidexample {
	public static void main(String[] args) {
        ReceiptPrinter rp = new ReceiptPrinter();
        rp.printreceipt("Sakshi", 1000);
    }
}
