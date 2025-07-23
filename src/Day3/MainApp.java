package Day3;

public class MainApp {
 public static void main(String[] args) {
	 CreditPayment cp=new CreditPayment(5000);
	 cp.makePayment();
	 
	  UpiPayment upi = new UpiPayment(1500);
      upi.makePayment();
      
      // Interface + Lambda Demo
      BillGenerator.displayheader();  // static method from interface
      BillGenerator bill=(amount)->{
    	  System.out.println("Amount: ₹" + amount);
          System.out.println("Thank you for your payment!");

      };

      bill.showBillFormat();  // default method
      bill.generate(6500);    // lambda expression used

 }
}
